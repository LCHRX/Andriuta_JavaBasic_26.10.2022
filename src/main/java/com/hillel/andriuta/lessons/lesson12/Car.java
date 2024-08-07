package com.hillel.andriuta.lessons.lesson12;

public class Car {

    private String modelName;


    public Car(String modelName)  {
        this.modelName = modelName;
    }

    public void start(){
        startElectronics();
        startFuelPump();
        startEngine();
    }

    private void startEngine() {
        System.out.println("start engine");
    }

    private void startFuelPump() {
        System.out.println("Start fuel pump");
    }

    private void startElectronics() {
        System.out.println("start electronics");
    }

    public void stop(){
        stopEngine();
        stopFuelPump();
        stopElectronics();
    }

    private void stopElectronics() {
        System.out.println("stop electronics");
    }

    private void stopFuelPump() {
        System.out.println("stop fuel pump");
    }

    private void stopEngine() {
        System.out.println("stop engine");

    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }
}
