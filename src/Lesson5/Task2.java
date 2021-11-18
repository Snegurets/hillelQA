package Lesson5;

public class Task2 {
    public static void main(String[] args) {

        int arr[] = {1, 5, 10, 15, 20};
        System.out.println(sumOfAGivenArray(arr));
    }

    public static Integer sumOfAGivenArray (int arr[]){
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        return sum;
    }
}
