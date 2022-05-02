package com.company.homework2_1;

import java.util.Scanner;

public class ElectronicWatches1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int hour;
        int minute;
        hour = number / 60 % 24;
        minute = number % 60;

        System.out.println(hour + " " + minute);

        in.close();
    }
}