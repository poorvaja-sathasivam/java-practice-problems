package com.Basic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int first = 0;
        int second = 1;

        System.out.println("Enter the nth term: ");
        int range = input.nextInt();

        for (int i = 0; i <range ; i++) {
            System.out.print(first + ", ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
