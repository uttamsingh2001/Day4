package com.javalogic;

import java.util.Scanner;

public class TableDemo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the start Number : ");
        int st1=sc.nextInt();
        System.out.println("Enter the End Number : ");
        int end= sc.nextInt();

        for(int start=st1;start<=end;start++)
        {
            for(int i=1;i<=10;i++){
                System.out.println(start+"*"+i+"="+start*i);
            }
            System.out.println(" ");
        }

    }
}
