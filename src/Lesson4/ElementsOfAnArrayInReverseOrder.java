package Lesson4;

public class ElementsOfAnArrayInReverseOrder {
    public static void main(String[] args) {
        String[] num = new String[] {"one", "two", "three", "four"};
        int amountChars = num.length;
        while (amountChars > 0) {
            System.out.println( num [amountChars - 1]);
            amountChars --;
        }
        System.out.println("");

        int arr[] = new int[] {1, 2, 3, 4, 5};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
