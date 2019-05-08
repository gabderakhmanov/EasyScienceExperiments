package com.experiments.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

    public static void main(String[] args){

        Collection<Animal> al = new ArrayList<>();

        al.add(new Animal(100, "Barsik"));
        al.add(new Animal(150, "Sharik"));
        al.add(new Animal(250, "Kesha"));



        Iterator<Animal> itr = al.iterator();

        while(itr.hasNext()){

            Animal anml = itr.next();
            anml.breed += "qwe";
            System.out.println(anml.price +""+anml.breed);
        }

    }

}
