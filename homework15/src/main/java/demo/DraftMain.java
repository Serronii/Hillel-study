package demo;

import validation.DraftCredential;

import java.util.Scanner;

public class DraftMain {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter login");
            String login = scanner.nextLine();
            System.out.println("Enter password");
            String password = scanner.nextLine();
            System.out.println("Enter confirm password");
            String confirmPassword = scanner.nextLine();
            System.out.println(DraftCredential.validateLogin(login,password,confirmPassword));

        }
    }
