package com.bossofthegym.core.abstractions;

import com.bossofthegym.core.abstractions.core.Instructor;

public abstract class Training implements CalculationCalories {

    private int durationMin;

             //тип      //поле
    private Instructor instructor;

    public Training(int durationMin, Instructor instructor) {
        this.durationMin = durationMin;
        this.instructor = instructor;
    }
    public int getDurationMin(){
        return durationMin;
    }

    public Instructor getInstructor() {
        return instructor;
    }

}
