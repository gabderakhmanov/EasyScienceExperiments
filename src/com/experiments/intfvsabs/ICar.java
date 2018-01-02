package com.experiments.intfvsabs;

public interface ICar {

    // all val always are public static final (CONSTANTS)
    int ii = 3;

    // it can use default methods with implementation
    default void beep(){
        System.out.println("beep");
    }

    // it can use static methods with implementation
    static void speed(){
        System.out.println("speed up");
    };

    // all methods always are public abstract
    void go();
    void stop();


}
