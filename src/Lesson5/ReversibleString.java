package Lesson5;

public class ReversibleString {
    public static void main(String[] args) {
        String string = "Polina", stringTwo = " ";
        reversibleString(string, stringTwo);
    }
    public static void reversibleString (String string, String stringTwo) {
        char ch = 0;
        for (int i = 0; i < string.length(); i++) {
            ch = string.charAt(i);
            stringTwo = ch + stringTwo;
        }
        System.out.println(stringTwo);
    }
}
