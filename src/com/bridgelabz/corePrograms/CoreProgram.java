package com.bridgelabz.corePrograms;

import java.util.Scanner;

public class CoreProgram {
    public static void main(String[] args) {

        flipCoin();
        leapYear();
        powerOfTwo();
    }

    public static void flipCoin() {


                Scanner sc = new Scanner(System.in);
                System.out.println("Enter how many times you want to flip the coin :");
                int count=sc.nextInt();
                int headFlip=0;
                int tailFlip=0;
                if (count>0) {
                    for (int i=1; i<=count;i++) {
                        double flip=Math.floor(Math.random()*10)%2;
                        if (flip<0.5) {
                            headFlip++;
                        }
                        else {
                            tailFlip++;
                        }
                    }
                }
                else {
                    System.out.println("Entered wrong value Please Enter Positive Integer");
                }
                double headPercent=(headFlip*100)/count;
                double tailPercent=(tailFlip*100)/count;
                System.out.println("Head flip percentage is : "+headPercent);
                System.out.println("Tail flip percentage is : "+tailPercent);


    }
    public static void leapYear(){
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  Any  4 Digit Number :");
        year=sc.nextInt();
        if(year > 999 && year < 10000) {
            if(year%400==0)
                System.out.println(year+" is a leap year");
            else  if(year%100!=0) {
                if(year%4==0)
                    System.out.println(year+" is a leap year");
                else
                    System.out.println(year+" is not a leap year");
            }
            else
                System.out.println(year+" is not a leap year");
        }
        else
            System.out.println("Year zero does not exist ");
    }
    public static void powerOfTwo(){
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
                }
            }

