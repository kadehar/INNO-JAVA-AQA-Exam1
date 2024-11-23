package com.github.kadehar.inno.exam1.task1;

public class Fence {

    private static final int FENCE_LENGTH = (12 * 3) + (62 * 5);

    public boolean ableToMakeSign(int length) {
        return length >= FENCE_LENGTH;
    }
}
