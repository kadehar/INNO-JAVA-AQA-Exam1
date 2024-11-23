package com.github.kadehar.inno.exam1.task4.player;

import com.github.kadehar.inno.exam1.task4.move.Move;
import com.github.kadehar.inno.exam1.task4.score.Score;

import java.util.Random;

public class Computer implements Player {
    private final Score score = new Score();
    private Move move;

    @Override
    public Move move() {
        return move;
    }

    @Override
    public void chooseMove() {
        Move[] moves = Move.values();
        Random random = new Random();
        int index = random.nextInt(moves.length);
        move = moves[index];
    }

    @Override
    public Score score() {
        return score;
    }
}
