package com.javalogic;

import java.util.Scanner;

public class CheckCard {

    static String getCreditCardType(String creditCardNumber) {
        String type = "";
        if (creditCardNumber != null) {
            if (creditCardNumber.startsWith("3")) {
                type = "American Express";
            } else if (creditCardNumber.startsWith("4")) {
                type = "Visa";
            } else if (creditCardNumber.startsWith("5")) {
                type = "Master";
            } else {
                type = "Card type is Not Found";
            }
        }
        return type;
    }


    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter The Credit Card  Number : ");
//        String num = sc.next();
//        System.out.println("Card Type is :" + getCreditCardType(num));

        System.out.println("TC1 =" + getCreditCardType("342346"));
        System.out.println("TC2 =" + getCreditCardType("442346"));
        System.out.println("TC3 =" + getCreditCardType("542346"));
        System.out.println("TC4 =" + getCreditCardType("942346"));

        System.out.println("TC5 =" + getCreditCardType(""));
        System.out.println("TC6 =" + getCreditCardType(null));


    }
}
