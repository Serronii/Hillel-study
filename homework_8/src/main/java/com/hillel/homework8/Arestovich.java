package com.hillel.homework8;

public class Arestovich {

    int age;
    String citizenOf;
    String work;
    Forecast forecast;
    String gender;

    public Arestovich(int age, String citizenOf, String work, Forecast forecast){
        this.age = age;
        this.citizenOf = citizenOf;
        this.work = work;
        this.forecast = forecast;
    }
    public Arestovich(int age, String gender){
        this.age = age;
        this.gender = gender;


    }
    public void printReview(){
        System.out.println("Возраст: " + age + " Гражданин: " + citizenOf + " Работа: " + work + " Прогноз: " + forecast.printForecast());
    }
    public void printReview2(){
        System.out.println("Возраст: " + age +", Пол: " + gender);
    }
}
