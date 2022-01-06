package Lesson13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Login:");
        String login = scanner.nextLine();

        System.out.println("Password:");
        String password = scanner.nextLine();

        System.out.println("confirmPassword:");
        String confirmPassword = scanner.nextLine();

        try {
            checkLogInInfo(login,password,confirmPassword);
        } catch (WrongLoginException e) {
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        }

    }

    private static boolean checkLogInInfo (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if(!login.matches("^[a-z_]{0,20}$")) {
            throw new WrongLoginException("Incorrect login");
        } else if (!password.matches("^[a-z_]{0,20}$") || !confirmPassword.matches("^[a-z_]{0,20}$") || !password.equals(confirmPassword)){
            throw new WrongPasswordException("Incorrect password");
        }
        return true;
    }
}
