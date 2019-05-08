package com.experiments.comparable;

import java.util.Arrays;

public class ComparableExmpl {

    public static void main(String[] args) {


        Animal anml1 = new Animal("Dog", 15, 150);
        Animal anml2 = new Animal("Cat", 15, 155);
        Animal anml3 = new Animal("Pig", 10, 160);


        Animal[] animals = {anml1, anml2, anml3};


        Arrays.sort(animals);

        for (Animal animal : animals) {

            System.out.println(animal.toString());

        }

    }

}
