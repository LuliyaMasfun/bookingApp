package com.group8.bookingapp.models;

public class BookedItems {
    private long id;
    private long userId;
    private long cameraId;
    private long soundId;
    private long lightId;


    public BookedItems(long userId, long cameraId, long soundId, long lightId) {
        this.userId = userId;
        this.cameraId = cameraId;
        this.soundId = soundId;
        this.lightId = lightId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getCameraId() {
        return cameraId;
    }

    public void setCameraId(long cameraId) {
        this.cameraId = cameraId;
    }

    public long getSoundId() {
        return soundId;
    }

    public void setSoundId(long soundId) {
        this.soundId = soundId;
    }

    public long getLightId() {
        return lightId;
    }

    public void setLightId(long lightId) {
        this.lightId = lightId;
    }

    @Override
    public String toString() {
        return "BookedItems{" +
                "id=" + id +
                ", userId=" + userId +
                ", cameraId=" + cameraId +
                ", soundId=" + soundId +
                ", lightId=" + lightId +
                '}';
    }
}
