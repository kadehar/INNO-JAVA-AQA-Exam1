package com.github.kadehar.inno.exam1.task4.player;

import com.github.kadehar.inno.exam1.task4.move.Move;
import com.github.kadehar.inno.exam1.task4.score.Score;

import java.util.Scanner;

public class User implements Player {
    private final Score score = new Score();
    private final Scanner scanner;
    private Move move;

    public User(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Move move() {
        return move;
    }

    @Override
    public Score score() {
        return score;
    }

    @Override
    public void chooseMove() {
        System.out.println("Выберите камень(К), ножницы(Н) или бумагу(Б):");
        String userInput = scanner.nextLine();
        char firstLetter = userInput.toUpperCase().charAt(0);
        if (firstLetter == 'К' || firstLetter == 'Н' || firstLetter == 'Б') {
            switch (firstLetter) {
                case 'К' -> move = Move.ROCK;
                case 'Н' -> move = Move.SCISSORS;
                case 'Б' -> move = Move.PAPER;
            }
        } else {
            chooseMove();
        }
    }
}
