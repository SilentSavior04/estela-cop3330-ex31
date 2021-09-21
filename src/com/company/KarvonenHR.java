package com.company;
import java.util.Scanner;

public class KarvonenHR {

        public static void main(String[] args)
        {
            int restingHR,age;

            Scanner sc=new Scanner(System.in);
            restingHR = sc.nextInt();
            age = sc.nextInt();

            System.out.println("Resting Pulse: " + restingHR + " Age: " + age);

            int intensity = 55;
            System.out.println("Intensity | Rate ");

            while(intensity<96){
                int Target = (((220 - age) - restingHR) * intensity) + restingHR;

                System.out.println(intensity+ "% | "+Target +" bpm ");
                intensity+=5;
            }
        }
    }


