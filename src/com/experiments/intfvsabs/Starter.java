package com.experiments.intfvsabs;

public class Starter {
    public static void main(String[] args) {

        Car car = new Car();
        car.go();
        car.stop();
        car.go(10);
        car.drive();
        car.beep();
        ICar.speed();

        // we can use the variable in inherits
        System.out.println(Car.ii);


    }
}
