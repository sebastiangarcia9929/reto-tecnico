/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebastian.garcia.game.controller;

import com.sebastian.garcia.game.model.Answer;
import com.sebastian.garcia.game.service.CategoryService;
import com.sebastian.garcia.game.service.GameService;
import com.sebastian.garcia.game.service.QuestionService;
import com.sebastian.garcia.game.model.Game;
import com.sebastian.garcia.game.model.Player;
import com.sebastian.garcia.game.model.Category;
import com.sebastian.garcia.game.model.Question;
import com.sebastian.garcia.game.model.ScoreHistory;
import com.sebastian.garcia.game.model.repository.HistoricoRepository;
import com.sebastian.garcia.game.util.RandomUtil;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author Hewlett Packard
 */
public class AppController {
    private static AppController INSTANCE = new AppController();
    private CategoryService categoryService;
    private QuestionService questionService;
    private GameService gameService;
    private HistoricoRepository historicoRepository;
    private Game currentGame;
    private List<Category> categories;
    private Question currentQuestion;
    private Player currentPlayer;

    private AppController() {  
        this.categoryService = new CategoryService();
        this.questionService = new QuestionService();
        this.gameService = new GameService();
        this.historicoRepository = new HistoricoRepository();
    }
    
    public static AppController getInstance() {
        if(null == INSTANCE) {
            INSTANCE = new AppController();
        }
        return INSTANCE;
    }
    
    public List<String> getCategoriesNames() {
        return categories.stream().map(Category::getName).collect(Collectors.toList());
    }
    
    public int getCurrentLevel() {
        return currentGame.getCurrentLevel();
    }
    
    public int getCurrentTotalScore() {
        return currentGame.getTotalScore();
    }
    
    public String getCurrentQuestionDescription() {
        return currentQuestion.getDescription();
    }
    
    public List<Answer> getCurrentAnswers() {
        return currentQuestion.getAnswers();
    }
    
    public void registerUser(String username) {
        currentPlayer = new Player();
        currentPlayer.setName(username);
    }

    public void configNewGame() {
       this.categories = categoryService.getCategorys();
    }

    public void createQuestion(int categoria, String description, List<String> answerDescriptions) {
        Category category = categories.get(categoria);
        Question question = this.questionService.createQuestion(category, description);
        question.setAnswers(createAsnwers(answerDescriptions));
        category.getQuestions().add(question);
    }
    
    public List<Answer> createAsnwers(List<String> answerDescriptions) {
        List<Answer> answers = answerDescriptions.stream().map(answerDescription -> {
            Answer answer = new Answer();
            answer.setDescription(answerDescription);
            return answer;
        }).collect(Collectors.toList());
        answers.get(0).setCorrect(true);
        return answers;
    }
    
    public boolean validateGameSetting() {        
        return !categories.stream().filter(category -> category.getQuestions().size() < 1).findFirst().isPresent();
    }

    public void initGame() {
        currentGame = new Game();
        currentGame.setRounds(gameService.getRounds());
        Category category = categories.get(currentGame.getCurrentLevel() - 1);
        int random = RandomUtil.getRandomNumber(category.getQuestions().size());
        currentQuestion = category.getQuestions().get(random);
    }

    public boolean validAnswer(Answer answer) {
        if(answer.isCorrect() && isFinalRound()) {
            sumTotalScore();
            endGameWin();
            return true;
        }

        if(answer.isCorrect()) {
            sumTotalScore();
            levelUp();
            return true;
        }

        endGameLose();
        return false;
    }
    
    public void leave() {
       saveHystory();
    }

    private void levelUp() {
        currentGame.setCurrentLevel(currentGame.getCurrentLevel() + 1);
        Category category = categories.get(currentGame.getCurrentLevel() - 1);
        currentQuestion = category.getQuestions().get(RandomUtil.getRandomNumber(category.getQuestions().size()));	
    }
    

    private void sumTotalScore() {
        currentGame.setTotalScore(currentGame.getTotalScore() + currentGame.getRounds().get(currentGame.getCurrentLevel() - 1).getScoreTowin());
    }

    public boolean isFinalRound() {
        return currentGame.getCurrentLevel() == currentGame.getRounds().size();
    }

    public void endGameWin() {
        saveHystory();
    }

    public void endGameLose() {
        resetTotalScore();
        saveHystory();
    }

    private void resetTotalScore() {
        currentGame.setTotalScore(0);
    }

    public void saveHystory() {
        ScoreHistory scoreHistory = new ScoreHistory();
        scoreHistory.setScore(currentGame.getTotalScore());
        scoreHistory.setUsername(currentPlayer.getName());
        historicoRepository.insert(scoreHistory);
    }
}
