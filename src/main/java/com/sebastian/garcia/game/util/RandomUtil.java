/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebastian.garcia.game.util;

import java.util.Random;

/**
 *
 * @author Hewlett Packard
 */
public class RandomUtil {
    private static Random random = new Random();
    private static final int MIN = 1;

    private RandomUtil() {}

    public static int getRandomNumber(int max) {
        return (int) ((Math.random()*(max-MIN)) + MIN ) - MIN; 
    }
}
