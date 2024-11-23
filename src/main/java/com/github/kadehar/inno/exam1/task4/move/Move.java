package com.github.kadehar.inno.exam1.task4.move;

public enum Move {
    ROCK("Камень"),
    PAPER("Бумага"),
    SCISSORS("Ножницы");

    private final String russianName;

    Move(String russianName) {
        this.russianName = russianName;
    }

    @Override
    public String toString() {
        return russianName;
    }
}
