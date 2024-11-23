package com.github.kadehar.inno.exam1.task1;

import java.util.Scanner;

public class FenceTask {
    public static void main(String[] args) {
        Fence fence = new Fence();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину забора в сантиметрах: ");
        int length = scanner.nextInt();
        String answer = fence.ableToMakeSign(length) ? "Надпись поместится" : "Надпись не поместится";
        System.out.println(answer);
    }
}