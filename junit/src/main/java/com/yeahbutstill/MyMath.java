package com.yeahbutstill;

public class MyMath {

    int sum(int[] numbers) {

        int sum = 0;
        for (int i : numbers) {

            sum += i;

        }

        return sum + 20;

    }

}