package com.ylab.homework;

public class Cat extends Animal{

    public Cat(boolean animalIsSleeping) {
        super(animalIsSleeping);
    }

    @Override
    public void speak() {
        System.out.println("Мяу");
    }

    @Override
    public void animalIsEating() {
        System.out.println("Кошка ест.");
    }

    @Override
    public void animalIsNotEating() {
        System.out.println("Кошка не ест.");
    }

    @Override
    public void animalIsSleeping() {
        System.out.println("Кошка спит.");
    }

    @Override
    public void animalIsNotSleeping() {
        System.out.println("Кошка не спит.");
    }

}
