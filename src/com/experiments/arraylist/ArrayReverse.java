package com.experiments.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayReverse {

    public static void main(String[] args) {


        List<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(3);
        al.add(4);
        al.add(6);

        for (Integer integer : al) {
            System.out.print(integer + " ");
        }
        System.out.println("\n");

        // reverse 1
        for (int i = al.size()-1; i >=0 ; i--) {
            System.out.print(al.get(i));
        }
        System.out.println("\n");

        // reverse 2
        for (int i = 0; i < al.size() ; i++) {
            int j = al.size() - i - 1;
            System.out.print(al.get(j) + " ");
        }


    }

}
