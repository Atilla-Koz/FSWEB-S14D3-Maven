package org.example;

public class Ford extends  Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " engine is starting";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " is accelerating rapidly";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " is braking efficiently";
    }
}
