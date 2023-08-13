package chapter5;

import java.util.Scanner;

public class E57_increasingOrDecreasing {
    private int number1,number2,number3;
    public E57_increasingOrDecreasing(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your three number :");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        number3 = scanner.nextInt();
        if(number1 <= number2 && number2 <= number3){
            System.out.println("Increasing");
        }else if(number3 <= number2 && number2 <= number1){
            System.out.println("decrasing");
        }else {
            System.out.println("neither");
        }
    }
}
