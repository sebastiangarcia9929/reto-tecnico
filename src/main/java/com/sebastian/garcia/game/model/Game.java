/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebastian.garcia.game.model;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Hewlett Packard
 */
public class Game {
    private int totalScore;
    private int currentLevel = 1;
    private List<Round> rounds = new ArrayList<>();

    public int getTotalScore() {
            return totalScore;
    }
    public void setTotalScore(int totalScore) {
            this.totalScore = totalScore;
    }
    public int getCurrentLevel() {
            return currentLevel;
    }
    public void setCurrentLevel(int currentLevel) {
            this.currentLevel = currentLevel;
    }
    public List<Round> getRounds() {
            return rounds;
    }
    public void setRounds(List<Round> rounds) {
            this.rounds = rounds;
    }
}
