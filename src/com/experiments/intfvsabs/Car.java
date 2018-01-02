package com.experiments.intfvsabs;

public class Car implements ICar {

    @Override
    public void go() {
        System.out.println("go");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    // we can overload methods from interface
    public void go(int step) {
        System.out.println("Go to " + step);
    }

    // we can add extra custom methods
    public void drive(){
        System.out.println("drive");
    }


}
