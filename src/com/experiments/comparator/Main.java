package com.experiments.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Animal anml1 = new Animal("1Dog", 165, 650);
        Animal anml2 = new Animal("Cat", 125, 750);
        Animal anml3 = new Animal("Bird", 35, 1350);

        Animal[] animals = {anml1, anml2, anml3};


        System.out.println("ComparatorByPrice");
        Arrays.sort(animals, new ComparatorByPrice());

        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }

        System.out.println("ComparatorBySpeed");
        Arrays.sort(animals, new ComparatorBySpeed());

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        System.out.println("ComparatorByName");
        Arrays.sort(animals, new ComparatorByName());

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        System.out.println("ComparatorBySpeed Anonymous");
        Arrays.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.speed - o2.speed;
            }
        });

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        System.out.println("ComparatorByPrice Anonymous lambda");
        Arrays.sort(animals, (o1, o2) -> o1.price - o2.price);
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
