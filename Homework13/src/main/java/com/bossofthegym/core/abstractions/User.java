package com.bossofthegym.core.abstractions;

import java.util.Arrays;

public class User {

    private int id;
    Training[] trainings;
    private int sumCalories;
    private int weight;

    private int index;

    public User(int id, int weight) {
        this.id = id;
        this.weight = weight;
        this.trainings = new Training[5];
        this.sumCalories = 0;
        index = 0;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void train(Training training){
        trainings[index]=training;
        sumCalories +=sumCalories+training.calculateCalories(weight);
        index++;

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", trainings=" + Arrays.toString(trainings) +
                ", sumCalories=" + sumCalories +
                ", weight=" + weight +
                ", index=" + index +
                '}';
    }
}
