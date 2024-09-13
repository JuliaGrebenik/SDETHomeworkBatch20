package org.example.e104;

import java.util.Scanner;

public class E104StringManipulations {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String []names=new String[5];
        System.out.println("In:");

        for (int i = 0; i <names.length ; i++) {
            names[i]=input.nextLine();

        }
        for (int i = 0; i <names.length ; i++) {
            System.out.println(names[i].substring(0,3));
            }
        }




    }


