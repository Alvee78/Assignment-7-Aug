package chapter5;

import java.util.Scanner;

public class E510_pairCheck {
    private int number1,number2,number3,number4;
    public E510_pairCheck(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your three number :");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        number3 = scanner.nextInt();
        number4 = scanner.nextInt();
        if(number1 == number2 && number3 == number4){
            System.out.println("Two pair");
        }else if(number1 == number3 && number2 == number4){
            System.out.println("Two pair");
        }else if(number1 == number4 && number2 == number3){
            System.out.println("Two pair");
        }else{
            System.out.println("Not in pair");
        }
    }
}
