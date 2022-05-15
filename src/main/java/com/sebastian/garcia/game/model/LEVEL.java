package com.sebastian.garcia.game.model;

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
