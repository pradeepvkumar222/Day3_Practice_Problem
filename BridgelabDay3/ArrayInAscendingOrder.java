package com.BridgelabDay3;

import java.util.Arrays;

public class ArrayInAscendingOrder {
//Java Program to sort the elements of an array in ascending order
    public static void main(String[] args) {
        int[] arr =  {1, 5, 3, 6, 8, 2, 5, 4, 10};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
