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
    private String light_brand;


    public Light(String model, String light_brand) {
        this.model = model;
        this.light_brand = light_brand;
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

    public String getLight_brand() {
        return light_brand;
    }

    public void setLight_brand(String light_brand) {
        this.light_brand = light_brand;
    }

    @Override
    public String toString() {
        return "Light{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", light_brand='" + light_brand + '\'' +
                '}';
    }
}
