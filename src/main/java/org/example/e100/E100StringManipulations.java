package org.example.e100;

import java.util.Scanner;

public class E100StringManipulations {
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);
        System.out.println("In: ");
        String str=input.nextLine();
        String reversed="";
        for (int i =str.length()-1; i>=0 ; i--) {
            reversed += str.charAt(i);
        }
            System.out.println(reversed);
        }

    }

