package org.example;

public class Car {
    public Car() {
        System.out.println("car constructor.......");
    }

    //target object
    Engine engine;

    public Car(Engine engine) {
        System.out.println("constructor DI.......");
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        System.out.println("car setter method.....");
        this.engine = engine;
    }

    public void drive(){
        int start = engine.start();
        if(start>0){
            System.out.println("car started.........");
        }
        else{
            System.out.println("car not started..........");
        }
    }
}
