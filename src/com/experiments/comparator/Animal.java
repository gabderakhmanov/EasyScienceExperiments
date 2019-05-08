package com.experiments.comparator;

public class Animal {

     String name;
     int speed;
     int price;


     Animal(String name, int speed, int price){
         this.name = name;
         this.speed = speed;
         this.price = price;
     }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }

}
