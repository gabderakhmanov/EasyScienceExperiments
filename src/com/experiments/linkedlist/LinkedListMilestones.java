package com.experiments.linkedlist;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMilestones {

    public static void main(String[] args) {

        //System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
    }


    public static long getTimeMsOfInsert(List list) {

        Date currentTime = new Date();

        //insert1000000toFirst(list);
        insert1000000DefaultOrder(list);

        Date newTime = new Date();

        Long msDelay = newTime.getTime() - currentTime.getTime();

        return msDelay;
    }


    public static void insert1000000toFirst(List list) {
        for (int i = 0; i < 1000000; i++) {
            // add as a first element
            // ArrayList = 96098 ms
            // LinkedList = 84 ms
            list.add(0, new Object());
        }
    }

    public static void insert1000000DefaultOrder(List list) {
        for (int i = 0; i < 20_000_000; i++) {

            // add one mln 1_000_000
            // ArrayList = 60 ms
            // LinkedList = 102 ms

            // add ten mlns 10_000_000
            // ArrayList = 2489 ms
            // LinkedList = 1582 ms

            // add 50 mlns 20_000_000
            // ArrayList = 5102 ms
            // LinkedList = 11399 ms


            list.add(new Object());
        }
        System.out.println(list.size());
    }

}
