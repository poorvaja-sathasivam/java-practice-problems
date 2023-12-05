package com.Basic;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers to swap: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.println("The numbers you entered are : A = "+number1+" and B = "+number2);

        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println("The swapped numbers are : A = "+number1+" and B = "+number2);
    }
}
