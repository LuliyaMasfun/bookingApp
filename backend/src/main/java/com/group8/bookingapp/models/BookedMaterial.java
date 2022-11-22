package com.group8.bookingapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BookedMaterial {
    @Id
    @GeneratedValue
    private int bookedMaterialId;
    @Column
    private Material material;
    @Column
    private User user;
    @Column
    private int bookedMaterialQuantity;


    public BookedMaterial() {};

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getBookedMaterialId() {
        return bookedMaterialId;
    }

    public int getBookedMaterialQuantity() {
        return bookedMaterialQuantity;
    }

    public void setBookedMaterialQuantity(int bookedMaterialQuantity) {
        this.bookedMaterialQuantity = bookedMaterialQuantity;
    }

    @Override
    public String toString() {
        return "BookedMaterial{" +
                "material=" + material +
                ", user=" + user +
                ", bookedMaterialId=" + bookedMaterialId +
                '}';
    }
}
