package com.amruta;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i=50000;
        float f =5.67f;
        char c ='a';
        double d=0.1234;
        short s=1024;
        byte b=42;
        double result=(f*b) + (i/c) - (d*s);
        // output: float + int - double= double
        System.out.println((f*b) + " " + (i/c)+ " "+ (d-s));
        System.out.println(result);

    }
}
