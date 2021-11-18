package Lesson5;

public class SortsAnArray {
    public static void main(String[] args) {
        int arr[] = new int[] {6, 35, 1, 10, 22, 15};
        sorts(arr);
    }
    public static int[] sorts(int[] arr) {
        int temp = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}
