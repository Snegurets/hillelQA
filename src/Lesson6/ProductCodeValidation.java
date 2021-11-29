package Lesson6;

public class ProductCodeValidation {
    public static void main(String[] args) {

        System.out.println(randomString());
    }

    public static String randomString() {

        String string = "";
        String stringFirst = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String stringSecond = "0123456789";
        String str1 = "";
        String str2 = "";
        String str3 = "";
        String str4 = "";
        String str5 = "";
        String str6 = "";
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;

        for (int i = 0; i < 2; i++) {
            string += stringFirst.charAt((int) (Math.random() * stringFirst.length() + 0));
        }

        for (int i = 0; i < 1; i++) {
            str1 += stringSecond.charAt((int) (Math.random() * stringSecond.length() + 0));
            string += str1;
        }
        for (int i = 0; i < 3; i++) {
            string += stringFirst.charAt((int) (Math.random() * stringFirst.length() + 0));
        }
        for (int i = 0; i < 1; i++) {
            str2 += stringSecond.charAt((int) (Math.random() * stringSecond.length() + 0));
            string += str2;
        }
        for (int i = 0; i < 1; i++) {
            str3 += stringSecond.charAt((int) (Math.random() * stringSecond.length() + 0));
            string += str3;
        }
        for (int i = 0; i < 2; i++) {
            string += stringFirst.charAt((int) (Math.random() * stringFirst.length() + 0));
        }
        for (int i = 0; i < 1; i++) {
            str4 += stringSecond.charAt((int) (Math.random() * stringSecond.length() + 0));
            string += str4;
        }
        for (int i = 0; i < 2; i++) {
            string += stringFirst.charAt((int) (Math.random() * stringFirst.length() + 0));
        }
        for (int i = 0; i < 1; i++) {
            str5 += stringSecond.charAt((int) (Math.random() * stringSecond.length() + 0));
            string += str5;
        }
        for (int i = 0; i < 3; i++) {
            string += stringFirst.charAt((int) (Math.random() * stringFirst.length() + 0));
        }
        for (int i = 0; i < 1; i++) {
            str6 += stringSecond.charAt((int) (Math.random() * stringSecond.length() + 0));
            string += str6;
        }
        for (int i = 0; i < 2; i++) {
            string += stringFirst.charAt((int) (Math.random() * stringFirst.length() + 0));
        }
        str1 += str2;
        str3 += str4;
        str5 += str6;
        number1 = Integer.parseInt(str1);
        number2 = Integer.parseInt(str3);
        number3 = Integer.parseInt(str5);
        int number4 = number1 * number2 * number3;
        string += " " + Integer.toString(number4);

        return string;
    }

}

