package com.company;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         for loop syntax
         for(intitialization ; condition ; increment decrement )
         {
         //
         }*/

        //q Print numbe 1 to 5
//        for (int num = 1 ; num <= 5 ; num+=2)
//        {
//            System.out.println(num);
//        }
//
//        //Print Numbers from i 10 n
//        int n = input.nextInt();
//        for(int num = 1 ; num <= n ; num++)
//        {
//            System.out.println(num);
//        }

        //While loop
        /*
        Syntax :
        while(condition)
        {
        body
        }
        * */

        int num =1 ;
        while (num<=5)
        {
            System.out.println(num);
            num++;
        }


        }
}
