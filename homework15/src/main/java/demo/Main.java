package demo;

import validation.CredentialsValidation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter login");
        String login = scanner.nextLine();
        System.out.println(CredentialsValidation.validateLogin(login));


        System.out.println("Enter password");
        String password = scanner.nextLine();
        System.out.println(CredentialsValidation.validatePassword(password));

        System.out.println("Enter Confirmation password");
        String confirmPassword = scanner.nextLine();
        System.out.println(CredentialsValidation.validateConfirmPassword(confirmPassword,password));

    }
}