package Lesson4;

public class ReversibleString {
    public static void main(String[] args) {
        String string = "Polina", stringTwo = " ";
        char ch;
        for(int i = 0; i < string.length(); i++){
            ch = string.charAt(i);
            stringTwo = ch + stringTwo;
        }
        System.out.println(stringTwo);
    }
}
