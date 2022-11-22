package com.group8.bookingapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Material {
    @Column
    @GeneratedValue
    private int materialNumber;
    @Id
    @GeneratedValue
    private int materialId;
    @Column
    private int materialName;
    @Column
    private int materialQuantity;
    @Column
    private Boolean materialIsBooked;


    public Material() {}

    public void setMaterialNumber(int materialNumber) {
        this.materialNumber = materialNumber;
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
