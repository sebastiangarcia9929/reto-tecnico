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
public class Category {
    private String name;
    private int level;
    private List<Question> questions = new ArrayList<>();

    public String getName() {
            return name;
    }
    public void setName(String name) {
            this.name = name;
    }
    public int getLevel() {
            return level;
    }
    public void setLevel(int level) {
            this.level = level;
    }
    public List<Question> getQuestions() {
            return questions;
    }
    public void setQuestions(List<Question> questions) {
            this.questions = questions;
    }
}
