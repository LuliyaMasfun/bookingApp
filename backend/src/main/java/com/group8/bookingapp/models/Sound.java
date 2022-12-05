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
    private String maker;

    public Sound() {
    }

    public Sound(String model, String maker) {
        this.model = model;

        this.maker = maker;
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

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    @Override
    public String toString() {
        return "Sound{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", maker='" + maker + '\'' +
                '}';
    }
}
