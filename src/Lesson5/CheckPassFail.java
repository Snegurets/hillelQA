package Lesson5;

public class CheckPassFail {
    public static void main(String[] args) {
        System.out.println(checkPass(60));
        System.out.println("Done");
    }

    public static boolean checkPass (int mark){
        if (mark >= 50) {
            return true;
        } else {
            return false;
        }
    }
}
