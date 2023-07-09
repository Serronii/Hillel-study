package com.bossofthegym.core.implementations;

import com.bossofthegym.core.abstractions.Training;
import com.bossofthegym.core.trainings.Instructor;

public class Fitness extends Training {

        private int repetitions;

        public Fitness(int durationMin, Instructor instructor, int repetitions) {
            super(durationMin, instructor);
            this.repetitions = repetitions;

        }

        public void setRepetitions(int repetitions) {
            this.repetitions = repetitions;
        }

        public int getRepetitions() {
            return repetitions;
        }

    @Override
    public int calculateCalories(int weight) {
        return indexCommon(weight) * getDurationMin() * repetitions;
    }
}
