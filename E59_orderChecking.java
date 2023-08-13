package chapter5;

import java.util.Scanner;

public class E59_orderChecking {
    private int number1,number2,number3;
    public E59_orderChecking(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your three number :");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        number3 = scanner.nextInt();
        if(number1 < number2 && number2 < number3){
            System.out.print(number1+" "+number2+" "+number3+" ");
            System.out.println("in order");
        }else if(number3 < number2 && number2 < number1){
            System.out.print(number1+" "+number2+" "+number3+" ");
            System.out.println("in order");
        }else if(number1 == number2 && number2 == number3){
            System.out.print(number1+" "+number2+" "+number3+" ");
            System.out.println("in order");
        }else{
            System.out.print(number1+" "+number2+" "+number3+" ");
            System.out.println("not in order");
        }
        }
}
