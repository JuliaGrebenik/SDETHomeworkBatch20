package org.example.e105;

import java.util.Scanner;

public class E105StringManipulations {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("In:");
        String word=input.nextLine();

        for (int i = 0; i <word.length() ; i++) {
            char v=word.charAt(i);
            if (v=='a' || v=='e' ||v=='i' ||v=='o'||v=='u'||v=='A'||v=='E'||v=='I'||v=='O'||v=='U'){
                System.out.print(v);
            }

        }




    }
}
