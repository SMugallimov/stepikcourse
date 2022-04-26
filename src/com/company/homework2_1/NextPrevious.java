package com.company.homework2_1;

import java.util.Scanner;

public class NextPrevious {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number.");

        int number = in.nextInt();
        int nextNumber = 1;
        System.out.println("The next number for the number " + number + " is " + (nextNumber + number) + ".");
        System.out.println("The previous number for the number " + number + " is " + --number + ".");

        in.close();
    }
}