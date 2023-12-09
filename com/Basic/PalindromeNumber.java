package com.Basic;

public class PalindromeNumber {
        public static void main(String[] args){
            int remainder,sum=0,temporary;
            int number=454;

            temporary=number;
            while(number>0){
                remainder=number%10;  //getting remainder
                sum=(sum*10)+remainder;
                number=number/10;
            }
            if(temporary==sum)
                System.out.println("It is a Palindrome Number.");
            else
                System.out.println("It is not a Palindrome Number.");
        }
}
