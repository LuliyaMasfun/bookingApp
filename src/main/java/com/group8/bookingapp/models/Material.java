package com.group8.bookingapp.models;


public class Material {

    private int materialNumber;
    private int materialId;
    private int materialName;

    private int materialQuantity;

    private Boolean materialIsBooked;



    //SETTERS
    public void setMaterialNumber(int materialNumber) {
        this.materialNumber = materialNumber;
    }
    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }
    public void setMaterialName(int materialName) {
        this.materialName = materialName;
    }

    public void setMaterialQuantity(int materialQuantity) {
        this.materialQuantity = materialQuantity;
    }

    public void setMaterialIsBooked(Boolean materialIsBooked) {
        this.materialIsBooked = materialIsBooked;
    }

    //GETTERS

    public int getMaterialNumber() {
        return materialNumber;
    }
    public int getMaterialId() {
        return materialId;
    }
    public int getMaterialName() {
        return materialName;
    }
    public int getMaterialQuantity() {
        return materialQuantity;
    }
    public Boolean getMaterialIsBooked() {
        return materialIsBooked;
    }

    @Override
    public String toString() {
        return "Material{" +
                "materialNumber=" + materialNumber +
                ", materialId=" + materialId +
                ", materialName=" + materialName +
                ", materialQuantity=" + materialQuantity +
                ", materialIsBooked=" + materialIsBooked +
                '}';
    }
}
