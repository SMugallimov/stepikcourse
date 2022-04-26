package com.company.homework2_1;

import java.util.Scanner;

public class NumberOfTenth2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        number = (number / 10) % 10;

        System.out.println(number);

        in.close();
    }
}