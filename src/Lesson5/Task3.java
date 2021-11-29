package Lesson5;

public class Task3 {
    public static void main(String[] args) {
        char arr [] = {'$', '%', '#', '5', 'h', '!'};
        returnsAnArrayOfASCIICodes(arr);
    }

    public static void returnsAnArrayOfASCIICodes (char[] arr){
        for (int elements: arr) {
            System.out.println(elements);
        }
    }
}
