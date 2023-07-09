package com.bossofthegym.core.trainings;

public class Instructor {

    private String name;
    private String level;

    public Instructor(String name, String level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
