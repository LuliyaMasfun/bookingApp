package com.group8.bookingapp.models;

public class User {

    private int userId;
    private String name;
    private BookedMaterial bookedMaterial;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BookedMaterial getBookedMaterial() {
        return bookedMaterial;
    }

    public void setBookedMaterial(BookedMaterial bookedMaterial) {
        this.bookedMaterial = bookedMaterial;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", bookedMaterial=" + bookedMaterial +
                '}';
    }
}
