package com.company;

/*public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}*/

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        if (((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) && (day > 31)){
            System.out.println(-1);
        }
        else if(((month == 4) || (month == 6) || (month == 9) || (month == 11)) && (day > 30)){
            System.out.println(-1);
        }
        else if((month == 2) && (day > 28)){
            System.out.println(-1);
        }

        else if (month == 1){
            System.out.println(365-day);
        }
        else if (month == 2){
            System.out.println(365-31 -day);
        }
        else if (month == 3){
            System.out.println(365-31-28-day);
        }
        else if (month == 4){
            System.out.println(365-31-28 -31-day);
        }
        else if (month == 5){
            System.out.println(365-31-28 -31 -30-day);
        }
        else if (month == 6){
            System.out.println(365-31-28 -31 -30-31-day);
        }
        else if (month == 7){
            System.out.println(365-31-28 -31 -30-31 -30-day);
        }
        else if (month == 8){
            System.out.println(365-31-28 -31 -30-31 -30 - 31-day);
        }
        else if (month == 9){
            System.out.println(365-31-28 -31 -30-31 -30 - 31 -31-day);
        }
        else if (month == 10){
            System.out.println(365-31-28 -31 -30-31 -30 - 31 -31 - 30-day);
        }
        else if (month == 11){
            System.out.println(365-31-28 -31 -30-31 -30 - 31 -31 - 30-31-day);
        }
        else if (month == 12){
            System.out.println(365-31-28 -31 -30-31 -30 - 31 -31 - 30-31-30-day);
        }
        else if (( day > 31) || (month > 12)) {
            System.out.println(-1);
        }


    }
}