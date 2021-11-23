package Lesson6;

public class Task1 {
    public static void main(String[] args) {
        String alpha = "alpha";
        String numeric = "numeric";
        String alphanumeric = "alphanumeric";
        System.out.println(randomlyGeneratedString(alpha, 12));
        System.out.println(randomlyGeneratedString(numeric, 7));
        System.out.println(randomlyGeneratedString(alphanumeric, 15));

    }
    public static String randomlyGeneratedString(String mode, int length){
        String string = "";
        if (mode.equals("alpha")){
            String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
            for (int i = 0; i < length; i++){
                string += str.charAt((int)(Math.random()*str.length()+0));
            }
        } if (mode.equals("numeric")){
            String str = "0123456789";
            for (int i = 0; i < length; i++){
                string += str.charAt((int)(Math.random()*str.length()+0));
            }
        } if (mode.equals("alphanumeric")){
            String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
            for (int i = 0; i < length; i++){
                string += str.charAt((int)(Math.random()*str.length()+0));
            }
        }
        return string;
    }
}
