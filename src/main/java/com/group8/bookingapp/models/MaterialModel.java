package com.group8.bookingapp.models;


public class MaterialModel {
    private int materialNumber;
    private int materialName;
    private String materialImage;
    private Boolean materialIsBooked;

    public void setMaterialNumber(int materialNumber) {
        this.materialNumber = materialNumber;
    }

    public void setMaterialName(int materialName) {
        this.materialName = materialName;
    }

    public void setMaterialImage(String materialImage) {
        this.materialImage = materialImage;
    }

    public void setMaterialIsBooked(Boolean materialIsBooked) {
        this.materialIsBooked = materialIsBooked;
    }
}
