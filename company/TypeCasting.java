package com.company;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        //automatic type promotion in experession
//        int a = 257 ;
//        byte b = (byte)(a);
//        System.out.println(b);


//        byte a = 40 ;
//        byte b = 90 ;
//        byte c = 100 ;
//
//        int d = (a*b) / c;
//        System.out.println(d);

         byte b = 42 ;
         char c = 'a';
         short s = 1024 ;
         int i = 9000 ;
         float f = 18.90f;
         double d = 0.1234 ;
         double resulet = (f*b) +(i-c)-(d*s);
        System.out.println((f*b)+ " " + (i-c) + " " + (d*s));
        System.out.println(resulet);



    }
}
