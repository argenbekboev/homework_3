package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        double[] num = {-1.9, 25.1, 23.5, 63.8, -100.2, -27.2, 58.9, -13.2, 776.8, 3.3, 1000.6, -8.8, 400.4, 9.9, -6.24};
        int numCount = 0;
        double allNum = 0.0;
        boolean proverka = false;
        for (double i : num) {
            if (i < 0) {
                proverka = true;
            } else if (i > 0 && proverka) {
                numCount++;
                allNum += i;
                System.out.println(i);
            }
        }
        System.out.println("Средний ариф.число = " + allNum / numCount);


        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    double temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(num));
        }

    }
}