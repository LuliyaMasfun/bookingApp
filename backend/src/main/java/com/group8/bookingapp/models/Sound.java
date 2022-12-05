package com.group8.bookingapp.models;

import javax.persistence.*;

@Entity
@Table(name = "sound")
public class Sound {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String model;

    @Column
    private String sound_brand;

    public Sound() {
    }

    public Sound(String model, String sound_brand) {
        this.model = model;
        this.sound_brand = sound_brand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSound_brand() {
        return sound_brand;
    }

    public void setSound_brand(String sound_brand) {
        this.sound_brand = sound_brand;
    }

    @Override
    public String toString() {
        return "Sound{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", sound_brand='" + sound_brand + '\'' +
                '}';
    }
}
