package com.group8.bookingapp.models;

public class Light {
    private long id;
    private String model;
    private int weight;
    private String maker;

    public Light(String model, int weight, String maker) {
        this.model = model;
        this.weight = weight;
        this.maker = maker;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    @Override
    public String toString() {
        return "Light{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ", maker='" + maker + '\'' +
                '}';
    }
}