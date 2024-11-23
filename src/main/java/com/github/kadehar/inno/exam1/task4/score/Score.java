package com.github.kadehar.inno.exam1.task4.score;

public class Score {
    private int points = 0;

    public void update(int points) {
        this.points += points;
    }

    public int points() {
        return points;
    }
}
