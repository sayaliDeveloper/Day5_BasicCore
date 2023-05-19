package com.bridgelabz.corePrograms;

import java.util.Scanner;

public class CoreProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        flipCoin();
        leapYear();
        // powerOfTwo();
        harmonicNumber();
        primeFactor();
        quotientAndRemainder();
    }

    public static void flipCoin() {

        System.out.println("Enter how many times you want to flip the coin :");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int headFlip = 0;
        int tailFlip = 0;
        if (count > 0) {
            for (int i = 1; i <= count; i++) {
                double flip = Math.floor(Math.random() * 10) % 2;
                if (flip < 0.5) {
                    headFlip++;
                } else {
                    tailFlip++;
                }
            }
        } else {
            System.out.println("Entered wrong value Please Enter Positive Integer");
        }
        double headPercent = (headFlip * 100) / count;
        double tailPercent = (tailFlip * 100) / count;
        System.out.println("Head flip percentage is : " + headPercent);
        System.out.println("Tail flip percentage is : " + tailPercent);


    }

    public static void leapYear() {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  Any  4 Digit Number :");
        year = sc.nextInt();
        if (year > 999 && year < 10000) {
            if (year % 400 == 0)
                System.out.println(year + " is a leap year");
            else if (year % 100 != 0) {
                if (year % 4 == 0)
                    System.out.println(year + " is a leap year");
                else
                    System.out.println(year + " is not a leap year");
            } else
                System.out.println(year + " is not a leap year");
        } else
            System.out.println("Year zero does not exist ");
    }

    /*public static void powerOfTwo(){
                if (args.length < 1) {
                    System.out.println("Enter value for N as a command-line argument.");
                } else {
                    int n = Integer.parseInt(args[0]);

                        if (n < 0 || n >= 31) {
                            System.out.println("Invalid input! N should be between 0 and 30.");
                        } else {
                            System.out.println("Powers of 2 table:");
                            System.out.println("Power\tValue");

                            for (int i = 0; i <= n; i++) {
                                int power = i;
                                int value = (int) Math.pow(2, i);
                                System.out.println(power + "\t" + value);
                            }
                        }
                    }
                }*/
    public static void harmonicNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of Number:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println(" N should be a positive integer.");
        } else {
            double harmonic = 0.0;

            for (int i = 1; i <= n; i++) {
                harmonic += 1.0 / i;
            }

            System.out.println("The " + n + "th Harmonic Value is: " + harmonic);
        }


    }

    public static void primeFactor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Prime factors of " + num + ": ");
        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num = num / i;
            }
        }
        if (num > 1) {
            System.out.print(num);
        }

    }

    public static void quotientAndRemainder() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

    }

}

