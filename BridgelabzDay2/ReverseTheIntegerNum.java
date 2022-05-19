package com.Bridgelab;
import java.util.Scanner;


public class ReverseTheIntegerNum {
public static void main(String [] args){
    // Write a Program to reverse the integer number eg: Input n=231 reverse is 132
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number=");
    int number = scanner.nextInt();
    int reverse =0;
    while (number !=0) {
        int lastDigit = number % 10;
        reverse = reverse * 10 + lastDigit;
        number = number / 10;
    }
    System.out.println(reverse);
}
}


