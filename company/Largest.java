package com.company;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        //Q. to find the LArgest of 3 numbers
//        if (num1>num2)
//        {
//            if (num1>num3)
//            {
//                System.out.println( num1 + " is the Largest number");
//            }
//
//        }
//
//        else if (num2 > num3)
//        {
//            System.out.println(num2 + " is the largest number ");
//        }
//
//        else
//        {
//            System.out.println( num3 + " is the largest number");
//        }

        int max = Math.max(num1 ,Math.max(num2, num3 ));
        {
            System.out.println( max);
        }



    }
}
