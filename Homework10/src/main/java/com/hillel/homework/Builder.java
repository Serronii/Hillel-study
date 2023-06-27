package com.hillel.homework;

public class Builder {
    public static void main(String[] args) {
        String numb = "3";

        StringBuilder stringBuilder = new StringBuilder(numb);
        stringBuilder.append(" + 56 = 59");
        System.out.println(stringBuilder);

        StringBuilder stringBuilder1 = new StringBuilder(numb);
        stringBuilder1.append(" - 56 = -53 ");
        stringBuilder1.deleteCharAt(7);
        stringBuilder1.insert(7,"равно");
        System.out.println(stringBuilder1);

        StringBuilder stringBuilder2 = new StringBuilder(numb);
        stringBuilder2.append(" * 56 = 168 ");
        stringBuilder2.replace(7,8,"равно");
        System.out.println(stringBuilder2);


    }
}