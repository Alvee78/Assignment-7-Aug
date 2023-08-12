package chapter5;

public class E53_checkDigit {
    private int number;
    public E53_checkDigit(int number){
        if(number < 0){
            this.number = -number;
        }
    }

    public int getDigit() {
        if(number<10){
            return 1;
        }else if(number < 100){
            return 2;
        }else if(number < 1000){
            return 3;
        }else if(number < 10000){
            return 4;
        }else if(number < 100000){
            return 5;
        }else if(number < 1000000){
            return 6;
        }
        return 0;
    }
}
