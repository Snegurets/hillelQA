package Lesson6;

public class SquareWordPatterns {
    public static void main(String[] args) {
        String word = "help";
        String str = "";
        System.out.println(word);
        for (int i = 0; i < word.length()-1; i++){
            word = word.substring(1) + word.substring(0, 1);
            System.out.println(word);

        }
    }
}

