package com.Bridgelab;
import java.util.Scanner;

public class Strings {
    public static void main(String [] args ){
    String data1, data2;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter first Strings");
    data1 =scanner.nextLine();

    System.out.println("Enter second Strings");
    data2 =scanner.nextLine();

    if(data1.equals(data2))
            System.out.print("Equal Strings");
    else
            System.out.print("UnEqual Strings");
   }

}
