package validation;

import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

import java.util.Scanner;

public class LoginPasswordValidator {

    public static boolean validateLoginAndPassword(String login, String password, String confirmPassword) {

            try {
                checkLogin(login);
                checkPassword(password, confirmPassword);
                return true;

            } catch (WrongLoginException e) {
                System.out.println("Exception" + e.getMessage());
                return false;
            } catch (WrongPasswordException e) {
                System.out.println("Exception" + e.getMessage());
                return false;
            }

        }
        public static void checkLogin(String login) throws WrongLoginException {

            if (login.length() >= 20 || !login.contains("_")) {
                throw new WrongLoginException("Wrong login!");

            }
        }
        public static void checkPassword(String password,String confirmPassword) throws WrongPasswordException {
            if (password.length() >= 20 || !password.contains("_") || !password.contains("!")) {
               throw new WrongPasswordException("Wrong Password!");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Password confirmation is wrong");
            }
    }
}
