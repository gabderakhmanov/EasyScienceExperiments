package com.experiments.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TrimToSizeExmpl {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(i);
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\n" + list.size());


        for (int i = 0; i < 50; i++) {
            list.remove(0);
        }

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }


        System.out.println("\n" + list.size());

        // do trimToSize
        list.trimToSize();


        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            al.add(i);
        }

        for (Integer integer : al) {
            System.out.print(integer + " ");
        }
        System.out.println();

        // change first and last
        Integer first = al.get(0);
        Integer last = al.get(al.size() - 1);
        al.set(0, last);
        al.set(al.size() - 1, first);


        System.out.println("======");

        for (Integer integer : al) {
            System.out.print(integer + " ");
        }




    }
}
