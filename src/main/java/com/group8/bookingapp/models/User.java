package com.group8.bookingapp.models;

public class User {

    private int userId;
    private String userName;
    private BookedMaterial bookedMaterial;

    public User() {}

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = userName;
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
                ", userName='" + userName + '\'' +
                ", bookedMaterial=" + bookedMaterial +
                '}';
    }
}
