package com.bossofthegym.core.demo;

import com.bossofthegym.core.trainings.User;
import com.bossofthegym.core.trainings.Instructor;
import com.bossofthegym.core.implementations.Run;

public class FitnessClub {
    public static void main(String[] args) {
        User user1 = new User(1,68);
        Instructor instructor = new Instructor("Pavel","2");
        Run run = new Run(20,instructor,11);

        user1.train(run);
        System.out.println(user1);
    }
}
