package com.javalogic;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(num+"*"+i+"="+num*i);
        }

    }
}
