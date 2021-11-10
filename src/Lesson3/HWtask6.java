package Lesson3;

public class HWtask6 {
    public static void main(String[] args) {
        int a = 1001;
        int discount = (a/100)*15;
        int aWithDiscount = a - discount;
        if (a > 1000){
            System.out.println("Предоставляется скидка 15%");
            System.out.println("Cумма покупки с учетом скидки " + aWithDiscount);
        } else {
            System.out.println("Cкидка не предоставляется.");
        }
    }
}
