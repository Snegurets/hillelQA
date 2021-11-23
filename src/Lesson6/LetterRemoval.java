package Lesson6;

public class LetterRemoval {
    public static void main(String[] args) {
        String letters = "H";
        removalAll(letters);

    }
    public static void removalAll(String letters) {
        String string = "Hello word";
        System.out.println(string.replace(letters, ""));

    }

}
