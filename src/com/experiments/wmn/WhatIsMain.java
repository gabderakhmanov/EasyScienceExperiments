package com.experiments.wmn;

public class WhatIsMain {

    public static void main(String[] args) {

        System.out.println(args.length);

        for (String arg : args){
            System.out.println(arg);
        }

        printRandomNumber();

    }

    static void printRandomNumber(){
        System.out.println(Math.random());
    }
}
