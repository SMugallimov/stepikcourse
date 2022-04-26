package com.company.homework2_1;

import java.util.Scanner;

public class Mkad {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int speed = in.nextInt();
        int time = in.nextInt();

        System.out.println(((speed * time) % 109 + 109) % 109);

        in.close();
    }
}