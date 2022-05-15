package com.sebastian.garcia.game.util;

import java.util.Random;

public class RandomUtil {

    private static final Random random = new Random();
    private static final int MIN = 1;

    private RandomUtil() {
    }

    public static int getRandomNumber(int max) {
        return (int) ((Math.random() * (max - MIN)) + MIN) - MIN;
    }
}
