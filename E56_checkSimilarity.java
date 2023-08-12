package chapter5;

import java.util.Scanner;

public class E56_checkSimilarity {
    private int number1,number2,number3;
    public E56_checkSimilarity(){
        System.out.println("Enter three number =");
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        number3 = scanner.nextInt();
    }
    public void check(){
        if(number1 == number2 && number2 == number3){
            System.out.println("All are same");
        }else{
            System.out.println("They are different");
        }
    }
}
