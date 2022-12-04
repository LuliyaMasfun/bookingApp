package com.group8.bookingapp.models;

import javax.persistence.*;

@Entity
@Table(name = "bookedItems")
public class BookedItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "camera_id", referencedColumnName = "id")
    private Camera camera;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sound_id", referencedColumnName = "id")
    private Sound sound;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "light_id", referencedColumnName = "id")
    private Light light;

    public BookedItems() {
    }

    public BookedItems(User user, Camera camera, Sound sound, Light light) {
        this.user = user;
        this.camera = camera;
        this.sound = sound;
        this.light = light;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public Sound getSound() {
        return sound;
    }

    public void setSound(Sound sound) {
        this.sound = sound;
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public String toString() {
        return "BookedItems{" +
                "id=" + id +
                ", user=" + user +
                ", camera=" + camera +
                ", sound=" + sound +
                ", light=" + light +
                '}';
    }
}
