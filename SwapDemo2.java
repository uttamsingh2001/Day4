package com.javalogic;

public class SwapDemo2 {
    public static void main(String[] args) {

        // Swap Number Without Using Third Variable


        int a=10;
        int b=20;

        System.out.println("Before Swap A : "+a+", B : "+b);

//        a=a+b; //30
//        b=a-b; //30-20=10
//        a=a-b; //30-10=20

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("After Swap A : "+a+", B : "+b);



    }
}
