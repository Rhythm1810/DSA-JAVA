package com.company;

import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number in celsius that you want to convert :  ");
        float celsius = input.nextFloat();
        float fhar  = (celsius * 9/5) + 32 ;
        System.out.println("the Temperature on Fhar is : "+fhar);

        }
    }

