package demo;

import validation.LoginPasswordValidator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter login");
        String login = scanner.nextLine();
        System.out.println();

        System.out.println("Enter password");
        String password = scanner.nextLine();

        System.out.println("Confirm the password");
        String confirmPassword = scanner.nextLine();
    }

}