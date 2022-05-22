package com.BridgelabDay3;

public class LargestElementsOfArray {
        //Java Program to print the largest element in an array
    public static void main(String [] args){
        int[] arr = {1,4,3,6,8,2,5,4,10};
        int max = arr[0];
        for (int i=0; i<arr.length; i++)
        {
            if (arr [i] > max)
            max = arr[i];

        }
        System.out.println(max);
}
}