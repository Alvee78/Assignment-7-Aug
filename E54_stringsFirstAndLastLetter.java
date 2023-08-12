package chapter5;

public class E54_stringsFirstAndLastLetter {
    private String string;
    public E54_stringsFirstAndLastLetter(String string){
        this.string = string;
    }
    public void check(){
        if(string.charAt(0) == string.charAt(string.length()-1)){
            System.out.println("first and last letter same");
        }else {
            System.out.println("first and last letter different");
        }
    }
}
