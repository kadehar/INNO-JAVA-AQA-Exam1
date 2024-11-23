package com.github.kadehar.inno.exam1.task4;

import com.github.kadehar.inno.exam1.task4.player.Computer;
import com.github.kadehar.inno.exam1.task4.player.Player;
import com.github.kadehar.inno.exam1.task4.player.User;
import com.github.kadehar.inno.exam1.task4.score.ScoreResult;
import com.github.kadehar.inno.exam1.task4.score.ScoreUpdater;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player user = new User(scanner);
        Player computer = new Computer();
        for (int i = 0; i < 5; i++) {
            System.out.printf("Раунд %d:\n", i + 1);
            user.chooseMove();
            computer.chooseMove();
            ScoreUpdater.updateScore(computer, user);
            ScoreResult.printScores(computer, user);
            System.out.println();
        }
        String winner = user.score().points() > computer.score().points()
                ? "Победил пользователь" : "Победил компьютер";
        int points = Math.max(user.score().points(), computer.score().points());
        System.out.printf("%s со счетом %d!%n", winner, points);
    }
}
