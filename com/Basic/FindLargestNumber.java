package com.Basic;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers to find the largest: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        int max = number1;

        if(number2>max){
            max = number2;
        }
        if(number3>max){
            max = number3;
        }

        System.out.println("The largest number is : " +max);

    }
}
