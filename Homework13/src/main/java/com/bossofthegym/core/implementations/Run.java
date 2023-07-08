package com.bossofthegym.core.implementations;

import com.bossofthegym.core.abstractions.Training;
import com.bossofthegym.core.abstractions.core.Instructor;

public class Run extends Training {

    private int speed;

    public Run(int durationMin, Instructor instructor, int speed) {
        super(durationMin, instructor);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public int calculateCalories(int weight) {
        return (indexCommon(weight) * getDurationMin()) * speed;
    }

    @Override
    public String toString() {
       return "Run{" +
                "durationMin=" + getDurationMin() +
                ", instructor=" + getInstructor().toString() +
                "speed=" + speed +
                '}';
    }
}
