package validation;

import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

import java.io.IOException;

public class CredentialsValidation {

    public static boolean validateLogin(String login) {

        try {
            checkLogin(login);
            return true;

        } catch (WrongLoginException e) {
            System.out.println("Exception" + e.getMessage());
            return false;
        } catch (IOException e) {
            System.out.println("Exception" + e.getMessage());
            return false;
        }
    }

    public static boolean validatePassword(String password) {
        try {
            checkPassword(password);
            return true;

        } catch (WrongPasswordException e) {
            System.out.println("Exception" + e.getMessage());
            return false;
        } catch (IOException e) {
            System.out.println("Exception" + e.getMessage());
            return false;
        }
    }

    public static boolean validateConfirmPassword(String confirmPassword,String password) {
        try {
            checkConfirmPassword(confirmPassword,password);
            return true;
        } catch (WrongPasswordException e) {
            System.out.println("Exception" + e.getMessage());
            return false;
        } catch (IOException e) {
            System.out.println("Exception" + e.getMessage());
            return false;
        }
    }


    public static void checkLogin(String login) throws WrongLoginException {

        if (login.length() >= 20 || !login.contains("_")) {
            throw new WrongLoginException(" - Wrong login! Login should be less than 20 symbols and should contain _  ");

        }
    }

    public static void checkPassword(String password) throws WrongPasswordException {

        if (password.length() >= 20 || !password.contains("_") || !password.contains("!")) {
            throw new WrongPasswordException(" - Wrong Password! Password should be less than 20 symbols and should contain _ and !  ");
        }
    }

    public static void checkConfirmPassword(String confirmPassword, String password) throws WrongPasswordException {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException(" - Password confirmation is wrong");
        }
    }
}
