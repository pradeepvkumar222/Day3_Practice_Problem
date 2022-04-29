package com.Bridgelab;

public class Problem03 {
    public static void main(String [] args) {
        // write a program for the sum of N natural number  Eg: Input N=5 Output 1+2+3+4+5
        int num = 5, sum = 0;

        for (int i = 1; i <= num; ++i) {
            // sum = sum + i;
            sum += i;

        }
        System.out.println("Sum= " + sum);
    }
    }

