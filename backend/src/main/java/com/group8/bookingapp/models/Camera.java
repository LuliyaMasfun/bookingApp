package com.group8.bookingapp.models;

public class Camera {
    private long id;
    private String model;
    private int pixel;
    private int weight;
    private String maker;


    public Camera(String model, int pixel, int weight, String maker) {
        this.model = model;
        this.pixel = pixel;
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

    public int getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
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
        return "Camera{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", pixel=" + pixel +
                ", weight=" + weight +
                ", maker='" + maker + '\'' +
                '}';
    }
}
