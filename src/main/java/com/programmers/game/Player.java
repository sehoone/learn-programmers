package com.programmers.game;

public class Player {
    private String name;
    private double errorRate;

    public Player(String name, double errorRate) {
        this.name = name;
        this.errorRate = errorRate;
    }

    public String getName() {
        return name;
    }

    public double getErrorRate() {
        return errorRate;
    }

    public boolean isCorrect() {
        boolean isCorrect = Math.random() > errorRate;
        return isCorrect;
    }
}
