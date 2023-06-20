package com.hillel.homework9;

public class StringsMethods {
    public static void main(String[] args) {

        String j = "I like Java!!!";
        System.out.println(j);

        System.out.println(j.charAt(13));

        System.out.println(j.endsWith("!!!"));

        System.out.println(j.startsWith("I like"));

        System.out.println(j.contains("Java"));

        int indexPosition = j.indexOf("Java");
        System.out.println(indexPosition);

        String v = j.replace("a","o");
        System.out.println(v);

        System.out.println(j.toLowerCase());
        System.out.println(j.toUpperCase());

        System.out.println(j.substring(7,11));





    }

}
