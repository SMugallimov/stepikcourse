package com.company.homework2_1;

import java.util.Scanner;

public class NumberOfTenth1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.println(Math.abs(number / 10));
    }
}