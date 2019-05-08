package com.experiments.comparator;

import java.util.Comparator;

public class ComparatorByPrice implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Animal)o1).price - ((Animal)o2).price;
    }
}
