package org.example;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return cylinders == car.cylinders && name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return cylinders * 31 + name.hashCode();
    }

    public String startEngine() {
        return getClass().getSimpleName() + " engine is starting";
    }

    public String accelerate() {
        return getClass().getSimpleName() + " is accelerating";
    }

    public String brake() {
        return getClass().getSimpleName() + " is braking";
    }

}
