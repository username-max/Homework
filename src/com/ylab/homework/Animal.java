package com.ylab.homework;

public abstract class Animal {
    public boolean animalIsSleeping;

    protected Animal(boolean animalIsSleeping) {
        this.animalIsSleeping = animalIsSleeping;
        if (animalIsSleeping == true) {
            animalIsSleeping();
            animalIsNotEating();


        }
        else {
            speak();
            animalIsNotSleeping();
            animalIsEating();
        }

    }

    public void speak() {
        System.out.println("Животное издаёт звук.");
    }

    public void animalIsEating() {
        System.out.println("Животное ест.");
    }
    public void animalIsNotEating() {
        System.out.println("Животное не ест.");
    }

    public void animalIsSleeping() {
        System.out.println("Животное спит.");
    }
    public void animalIsNotSleeping() {
        System.out.println("Животное не спит.");
    }

}
