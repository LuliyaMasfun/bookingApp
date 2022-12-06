package com.group8.bookingapp.models;

import javax.persistence.*;

@Entity
@Table(name = "light")
public class Light {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String model;
    @Column
    private String brand;

    public Light(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public Light() {
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Light{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
