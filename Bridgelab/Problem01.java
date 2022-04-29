package com.Bridgelab;
import java.util.Scanner;
public class Problem01 {
    public static void main(String[] args) {
        //write program for the sum of natural numbers eg: Input N=5 Output 1+2+3+4+5
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number");
        int end = number.nextInt();
        int start = 0;
        int Sum = 5;
        while (start <= end) {
            Sum = Sum + start;
            start++;
        }

        System.out.println(Sum);
    }
}
