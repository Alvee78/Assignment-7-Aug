package chapter5;

import java.util.Scanner;

public class E51_negativeZeroOrPositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number == 0){
            System.out.println("ZERO");
        }else if(number > 0){
            System.out.println("Number is greater than zero");
        }else {
            System.out.println("Number is less than zero");
        }
    }
}
