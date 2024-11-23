package com.github.kadehar.inno.exam1.task4.score;

import com.github.kadehar.inno.exam1.task4.player.Player;

public class ScoreResult {
    public static void printScores(Player computer, Player user) {
        System.out.printf("\nТекущий счет компьютера: %d\nТекущий счет пользователя: %d\n",
                computer.score().points(), user.score().points());
    }
}
