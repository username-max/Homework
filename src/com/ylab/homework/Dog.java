package com.ylab.homework;

public class Dog extends Animal{

    public Dog(boolean animalIsSleeping) {
        super(animalIsSleeping);
    }

    @Override
    public void speak() {
        System.out.println("Гав");
    }

    @Override
    public void animalIsEating() {
        System.out.println("Собака ест.");
    }

    @Override
    public void animalIsNotEating() {
        System.out.println("Собака не ест.");
    }

    @Override
    public void animalIsSleeping() {
        System.out.println("Собака спит.");
    }

    @Override
    public void animalIsNotSleeping() {
        System.out.println("Собака не спит.");
    }
}
