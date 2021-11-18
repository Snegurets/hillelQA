package Lesson5;

public class MinimumValueInAnArray {

    public static void main(String[] args) {
        int arr[] = new int[] {1, 2, 3, 4, 5};
        minimumValueInAnArray(arr);

    }
    public static int[] minimumValueInAnArray(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println(min);
        return arr;
    }
}
