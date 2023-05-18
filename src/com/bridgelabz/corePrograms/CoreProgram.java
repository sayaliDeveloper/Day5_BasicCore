package com.bridgelabz.corePrograms;

import java.util.Scanner;

public class CoreProgram {
    public static void main(String[] args) {

        flipCoin();
        leapYear();
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
    }
