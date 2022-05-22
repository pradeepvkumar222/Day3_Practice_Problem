package com.BridgelabDay3;

public class ArrayPresentOnODDPosition {
    //Java Program to print the elements of an array present on odd position
    public static void main(String[] args) {
        int[] arr =  {1, 5, 3, 6, 8, 2, 5, 4, 10};
        System.out.println("Elements of given array present on ODD position : ");
        for (int i = 0; i < arr.length; i = i+2)
            System.out.println(arr [i]);
        }
    }


