package org.example;

public class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " engine is starting";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " is accelerating powerfully";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " is braking effectively";
    }
}
