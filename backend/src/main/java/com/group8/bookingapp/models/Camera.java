package com.group8.bookingapp.models;


import javax.persistence.*;

@Entity
@Table(name="camera")
public class Camera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String model;
    @Column
    private String maker;

    public Camera() {
    }

    public Camera(String model,String maker) {
        this.model = model;
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
                ", maker='" + maker + '\'' +
                '}';
    }
}
