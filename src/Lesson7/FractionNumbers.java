package Lesson7;

public class FractionNumbers {
    private int firstField = 0;
    private int secondField = 0;
    private String method;


    public FractionNumbers(int firstField, int secondField, String method) {
        this.firstField = firstField;
        this.secondField = secondField;
        this.method = method;
    }
    public int Plus(){
        return firstField + secondField;
    }
    public int Minus(){
        return firstField - secondField;
    }
    public int Multiply(){
        return firstField * secondField;
    }
    public int Divide(){
        return firstField / secondField;
    }

    @Override
    public String toString(){
        switch(method) {
            case "Plus":
                return "" + Plus();
            case "Minus":
                return "" + Minus();
            case "Multiply":
                return "" + Multiply();
            case "Divide":
                if (secondField != 0) {
                    return "" + Divide();
                } else {
                    return "Don't divide by zero";
                }
            default:
                return "Wrong method, try again.";
        }
    }
}
