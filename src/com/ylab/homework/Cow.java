package com.ylab.homework;

public class Cow extends Animal {

    public Cow(boolean animalIsSleeping) {
        super(animalIsSleeping);
    }

    @Override
    public void speak() {
        System.out.println("Муу");
    }

    @Override
    public void animalIsEating() {
        System.out.println("Корова ест.");
    }

    @Override
    public void animalIsNotEating() {
        System.out.println("Корова не ест.");
    }

    @Override
    public void animalIsSleeping() {
        System.out.println("Корова спит.");
    }

    @Override
    public void animalIsNotSleeping() {
        System.out.println("Корова не спит.");
    }
}
