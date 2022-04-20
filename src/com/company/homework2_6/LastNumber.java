package com.company.homework2_6;

import java.util.Scanner;

public class LastNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.println(number % 10);

        in.close();
    }
}