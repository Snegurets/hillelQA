package Lesson4;

import java.util.Arrays;

public class SortsAnArray {
    public static void main(String[] args) {
        int [] arr = new int [] {6, 35, 1, 10, 22, 15};
        for (int i = 0; i < arr.length; i++){
            Arrays.sort(arr);
            System.out.println(arr[i]);
        }
    }
}
