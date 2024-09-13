package org.example.e139;

public class E139AccessModifiers {

    public String replaceSpaces( String str){
        return str.replace(" ", "_");

    }

    public static void main(String[] args) {

E139AccessModifiers m= new E139AccessModifiers();
        System.out.println(m.replaceSpaces("hello world"));
        System.out.println(m.replaceSpaces("java is fun"));
        System.out.println(m.replaceSpaces("i love coding"));
    }




    }


