package chapter5;

public class E55_checkStringsFirstAndSecondHalf {
    private String string;
    public E55_checkStringsFirstAndSecondHalf(String string){
        this.string = string;
    }
    public void check(){
        for(int counter = 1; counter<string.length()/2; counter++){
            if(string.charAt(counter)!=string.charAt((string.length()+1)/2 + counter)){
                System.out.println("“first and second half different”.");
                return;
            }
            System.out.println("“first and second half same”.");
        }
    }
}
