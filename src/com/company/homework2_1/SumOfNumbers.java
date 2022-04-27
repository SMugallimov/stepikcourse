package com.company.homework2_1;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int sum = 0;

        sum = Math.abs(number % 10 + number / 100 + number / 10 % 10);

        System.out.println(sum);

        in.close();
    }
}