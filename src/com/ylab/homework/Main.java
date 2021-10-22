package com.ylab.homework;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Animal cat = new Cat(false);
        System.out.println("--------------------");
        Animal catSec = new Cat(true);
        System.out.println("--------------------");
        System.out.println("--------------------");
        Animal dog = new Dog(true);
        System.out.println("--------------------");
        Animal dogSec = new Dog(false);
        System.out.println("--------------------");
        System.out.println("--------------------");
        Animal cow = new Cow(false);
        System.out.println("--------------------");
        Animal cowSec = new Cow(true);

    }
}
