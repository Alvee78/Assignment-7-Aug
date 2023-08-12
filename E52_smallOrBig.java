package chapter5;

import java.util.Scanner;

public class E52_smallOrBig {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        if(number == 0){
            System.out.println("Number is equal to ZERO");
        }else if(number > 0){
            if(number < 1)
                System.out.println("Number is positive and small");
            else if(number <= 1000000)
                System.out.println("Number is positive");
            else
                System.out.println("Number is positive and large");

        }else {
            if(Math.abs(number) < 1)
                System.out.println("Number is negative and small");
            else if(Math.abs(number) <= 1000000)
                System.out.println("Number is negative");
            else
                System.out.println("Number is negative and large");
        }
    }
}
