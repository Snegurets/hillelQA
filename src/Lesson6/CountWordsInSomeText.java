package Lesson6;

public class CountWordsInSomeText {
    public static void main(String[] args) {
        String str = "Hello word";
        System.out.println("You have " + getCountWords(str) + " words in your String");

    }
    public static int getCountWords(String str){
        int result = 0;
        if (str == null || str.isEmpty()) {
            return 0;
        }

        String[] words = str.split(" ");
        result = words.length;
        return result;
    }
}
