package Lesson8;

import java.util.Scanner;

public class LoginAndPassword {
    private String getStringFromScanner() {
        System.out.println("Enter your value please:" );
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private String login = getStringFromScanner();
    private String pass = getStringFromScanner();

    public String loginAndPassword(){
        if (login.equals("test") && pass.equals("test")){
            OptionTypeOfNumber optionTypeOfNumber = new OptionTypeOfNumber();
            return optionTypeOfNumber.getOptionTypeOfNumber();
        }else {
            return "Error. Login or password incorect. Try again";
        }
    }
}
