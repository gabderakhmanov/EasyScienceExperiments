package com.experiments.intfvsabs;

public interface ICar {

    // all val always are public static final
    int ii = 3;

    // all methods always are public abstract
    default void beep(){
        System.out.println("beep");
    }

    void go();
    void stop();


}
