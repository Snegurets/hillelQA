package Lesson6;

public class UpperLowerCaseChange {
    public static void main(String[] args) {
        String str1 = "HELLO WORD";
        String str2 = "hello word";
        String capitalize = str2.substring(0, 1).toUpperCase() + str2.substring(1);
        System.out.println(str1.toLowerCase());
        System.out.println(str2.toUpperCase());
        System.out.println(capitalize);
    }
}
