package com.BridgelabDay3;

public class ArrayReverseOrder {
    //Java Program to print the elements of an array in reverse order
    public static void main(String [] args){
        int[] arr = {1,4,3,6,8,2,5,4,10};
        for (int i=0; i<arr.length; i++)
        {
               System.out.println(arr[i]);
        }
        System.out.println("reverse order");
        for(int i= arr.length-1; i>=0;i--){
            System.out.println(arr[i]);
    }
}
}
