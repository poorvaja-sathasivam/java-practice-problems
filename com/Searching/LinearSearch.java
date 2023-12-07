package com.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,43,23,4,5,6,2,34};
        int target = 23;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==target){
                System.out.println("Target found at index "+i);
            }
        }
    }
}
