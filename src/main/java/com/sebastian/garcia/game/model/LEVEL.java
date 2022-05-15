/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.sebastian.garcia.game.model;

/**
 *
 * @author Hewlett Packard
 */
public enum LEVEL {
    ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5);

    private final int value;

    LEVEL(final int value) {
            this.value = value;
    }

    public int getValue() {
            return value;
    }
}
