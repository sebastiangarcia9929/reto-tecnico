package com.sebastian.garcia.game.service;

import com.sebastian.garcia.game.model.Category;
import com.sebastian.garcia.game.model.Question;
import java.util.ArrayList;
import java.util.List;

public class QuestionService {

    public Question createQuestion(Category category, String description) {
        List<Question> questions = new ArrayList<>();

        Question question = new Question();
        question.setCategory(category);
        question.setDescription(description);

        return question;
    }
}
