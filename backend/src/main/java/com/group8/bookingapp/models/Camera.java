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
    private String camera_brand;

    public Camera() {
    }

    public Camera(String model, String camera_brand) {
        this.model = model;
        this.camera_brand = camera_brand;
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

    public String getCamera_brand() {
        return camera_brand;
    }

    public void setCamera_brand(String camera_brand) {
        this.camera_brand = camera_brand;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", camera_brand='" + camera_brand + '\'' +
                '}';
    }
}
