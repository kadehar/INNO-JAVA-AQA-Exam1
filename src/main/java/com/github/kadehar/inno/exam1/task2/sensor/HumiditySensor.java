package com.github.kadehar.inno.exam1.task2.sensor;

import java.util.concurrent.ThreadLocalRandom;

public class HumiditySensor {
    public static int humidity() {
        return ThreadLocalRandom.current().nextInt(0, 101);
    }
}
