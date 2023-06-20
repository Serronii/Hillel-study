package com.hillel.homework9;

public class StudentsList {

    public static void printStudInfo(String surname, int grade,String subject) {

        String formatPrint = String.format("Cтудент %-15s получил %-3d по %-10s",surname,grade,subject);
        System.out.println(formatPrint);
    }
    public static void main(String[] args) {
        printStudInfo("Буданов",5,"Философия");
        printStudInfo("Арестович",10,"Философия" );
    }
}