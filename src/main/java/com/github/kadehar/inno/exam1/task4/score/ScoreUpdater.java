package com.github.kadehar.inno.exam1.task4.score;

import com.github.kadehar.inno.exam1.task4.move.Move;
import com.github.kadehar.inno.exam1.task4.player.Player;

public class ScoreUpdater {

    private static final int ROCK_POINTS = 1;
    private static final int SCISSORS_POINTS = 2;
    private static final int PAPER_POINTS = 5;

    public static void updateScore(Player computer, Player user) {
        System.out.printf("Компьютер выбрал: %s\nПользователь выбрал: %s\n",
                computer.move(), user.move());

        if (computer.move() == user.move())
            return;

        switch (computer.move()) {
            case ROCK -> {
                if (user.move() == Move.SCISSORS) {
                    computer.score().update(ROCK_POINTS);
                } else {
                    user.score().update(PAPER_POINTS);
                }
            }
            case PAPER -> {
                if (user.move() == Move.ROCK) {
                    computer.score().update(PAPER_POINTS);
                } else {
                    user.score().update(SCISSORS_POINTS);
                }
            }
            case SCISSORS -> {
                if (user.move() == Move.PAPER) {
                    computer.score().update(SCISSORS_POINTS);
                } else {
                    user.score().update(ROCK_POINTS);
                }
            }
        }
    }
}
