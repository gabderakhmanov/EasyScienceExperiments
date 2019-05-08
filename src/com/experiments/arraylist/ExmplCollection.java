package com.experiments.arraylist;

import java.util.ArrayList;
import java.util.Collection;

public class ExmplCollection {

    public static void main(String[] args) {

        Collection<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        System.out.println(list1.add(1));

        Collection<Integer> list2 = new ArrayList<>();

        list2.addAll(list1);
        //list2.clear();

        System.out.println(list2.isEmpty());



    }
}
