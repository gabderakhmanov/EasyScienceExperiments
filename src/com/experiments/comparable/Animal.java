package com.experiments.comparable;

public class Animal implements Comparable {

    public String name;
    public int speed;
    public int price;

    public Animal(String name, int speed, int price) {
        this.name = name;
        this.speed = speed;
        this. price = price;
    }


    public int compareTo(Object o) {

        // comp for speed and price

        int tmp = this.speed - ((Animal)o).speed;

        if (tmp == 0){
            return this.price - ((Animal)o).price;
        } else {
            return tmp;
        }

        // comp for name
        //return this.name.compareTo(((Animal)o).name);

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
