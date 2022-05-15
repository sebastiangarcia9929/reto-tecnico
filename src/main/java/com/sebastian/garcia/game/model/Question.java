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
public class Question {
    private Category category;
    private String description;
    private List<Answer> answers = new ArrayList<>(); 

    public Category getCategory() {
            return category;
    }
    public void setCategory(Category category) {
            this.category = category;
    }
    public String getDescription() {
            return description;
    }
    public void setDescription(String description) {
            this.description = description;
    }
    public List<Answer> getAnswers() {
            return answers;
    }
    public void setAnswers(List<Answer> answers) {
            this.answers = answers;
    }
}
