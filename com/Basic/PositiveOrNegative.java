package com.Basic;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to find out if it is positive or negative: ");
        int number = input.nextInt();

        if(number>=0){
            System.out.println("The number is positive.");
        }
        else {
            System.out.println("The number is negative.");
        }
    }
}
