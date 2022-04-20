package com.company.homework2_7;

import java.util.Scanner;

public class NumberOfTenth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.println(Math.abs(number / 10));
    }
}