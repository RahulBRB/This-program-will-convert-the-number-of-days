package com.company;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Main {

    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int noOfDays, Year, Month, Week, Days;


        System.out.println("Welcome to \"Days into year converter\"");
        System.out.println("This program will convert the no. of days into year : month : week : day. Powered by Java.");
        System.out.println("Write the no. of days:");
        noOfDays = scan.nextInt();
        System.out.println("Number of days mentioned = " + noOfDays);


        Year = noOfDays / 365;
        noOfDays = noOfDays % 365;

        Month = noOfDays / 30;
        noOfDays = noOfDays % 30;

        Week = noOfDays / 7;
        noOfDays = noOfDays % 7;

        System.out.println("Year: " + Year);
        System.out.println("Month: " + Month);
        System.out.println("Week: " + Week);
        System.out.println("Day: " + noOfDays);


    }
}
