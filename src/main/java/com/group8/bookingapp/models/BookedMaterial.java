package com.group8.bookingapp.models;

public class BookedMaterial {
    private Material material;
    private User user;
    private int bookedMaterialId;


    //GETTERS AND SETTER
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

    public void setBookedMaterialId(int bookedMaterialId) {
        this.bookedMaterialId = bookedMaterialId;
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
