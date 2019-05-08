package com.experiments.comparator;

import java.util.Comparator;

public class ComparatorBySpeed implements Comparator<Animal> {


    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.speed - o2.speed;
    }
}
