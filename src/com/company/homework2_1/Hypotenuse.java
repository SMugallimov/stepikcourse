package com.company.homework2_1;

import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input two numbers: ");

        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = (int)Math.sqrt(Math.pow(number1, 2) + Math.pow(number2, 2));

        System.out.println(number3);

        in.close();
    }
}