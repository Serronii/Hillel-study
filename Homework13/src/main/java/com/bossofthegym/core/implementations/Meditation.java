package com.bossofthegym.core.implementations;

import com.bossofthegym.core.abstractions.Training;
import com.bossofthegym.core.abstractions.core.Instructor;

public class Meditation extends Training {

    private int breathPerMinute;

    public Meditation(int durationMin, Instructor instructor, int breathPerMinute) {
        super(durationMin, instructor);
        this.breathPerMinute = breathPerMinute;
    }

    public int getBreathPerMinute() {
        return breathPerMinute;
    }

    @Override
    public int calculateCalories(int weight) {
        return (indexCommon(weight) * getDurationMin()) / breathPerMinute;
    }
}
