package com.company.homework2_1;

import java.util.Scanner;

public class NextEvenNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int evenNumber = in.nextInt();

        evenNumber = (evenNumber + 2) - evenNumber % 2;

        System.out.println(evenNumber);
    }
}