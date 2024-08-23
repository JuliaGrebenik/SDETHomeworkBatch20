package src.main.java.org.example.e101;

import java.util.Scanner;

public class E101StringManipulations {
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);
        System.out.println("In: ");
        String str=input.nextLine();
        String str1="";

        for (int i = 0; i <str.length() ; i+=2) {
            str1+=str.charAt(i);
        }
        System.out.println(str1);
    }
}
