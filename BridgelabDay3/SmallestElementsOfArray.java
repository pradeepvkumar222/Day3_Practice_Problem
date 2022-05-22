package com.BridgelabDay3;

public class SmallestElementsOfArray {
        //Java Program to print the smallest element in an array
        public static void main(String [] args){
            int[] arr = {1,4,3,6,8,2,5,4,10};
            int small = Integer.MAX_VALUE;
            for (int i=0; i<arr.length; i++)
            {
                if (arr [i] < small)
                    small = arr[i];

            }
            System.out.println(small);
        }
    }

