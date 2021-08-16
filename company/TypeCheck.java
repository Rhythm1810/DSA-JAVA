package com.company;

import java.util.Scanner;

public class TypeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        //next will just return the word
        //trim will remove all the extra space

        char ch = in.next().trim().charAt(0);
        System.out.println(ch);
        if(ch >= 'a' && ch<= 'z')
        {
            System.out.println( ch +  " is lower case");
        }
        else {
            System.out.println(ch + " is upper case");
        }



    }
}
