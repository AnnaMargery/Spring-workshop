package com.example.demo;

public class Car {

    private String model;
    private String marka;

    public Car(String model, String marka) {
        this.model = model;
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
}
