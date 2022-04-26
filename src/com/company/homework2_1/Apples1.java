package com.company.homework2_1;

import java.util.Scanner;

public class Apples1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int students = in.nextInt();
        int apples = in.nextInt();
        System.out.println(apples / students);

        in.close();
    }
}