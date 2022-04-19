package com.company;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D'; //occupies 2bytes / 16bits
        char myUnicode = '\u0044'; //unicode version of letter "D"
        char mySecondUnicode = '\u00A9';

        System.out.println(myChar);
        System.out.println(myUnicode);
        System.out.println(mySecondUnicode);

        boolean myTrue = true;
        boolean myFalse = false;
        boolean isCustomerOverEighteen = true; //Common practice to name booleans as a question
        System.out.println(myTrue);
        System.out.println(myFalse);


    }
}
