package com.company.homework2_4;

import java.util.Scanner;

public class Apples {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int students = in.nextInt();
        int apples = in.nextInt();

        System.out.println(apples % students);

        in.close();
    }
}