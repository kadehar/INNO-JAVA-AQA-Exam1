package com.github.kadehar.inno.exam1.task4.player;

import com.github.kadehar.inno.exam1.task4.move.Move;
import com.github.kadehar.inno.exam1.task4.score.Score;

public interface Player {
    Move move();
    Score score();
    void chooseMove();
}
