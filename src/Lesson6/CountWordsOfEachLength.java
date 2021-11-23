package Lesson6;

public class CountWordsOfEachLength {

    public static void main(String[] args) {
        String string = "Hello word";
        countWords(string);
    }

    public static void countWords(String string) {
        String[] amount = string.split(" ");
        System.out.println("Amount of word in the sentence is " + amount.length);
        for (int i = 0; i < amount.length; i++) {
            System.out.println("Amount of character in the word № " + (i + 1) + " is " + amount[i].length());

        }
    }

}



