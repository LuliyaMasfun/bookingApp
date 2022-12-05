package com.group8.bookingapp.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;


@Entity
@Table(name = "bookedItems")
@Getter
@Setter
public class BookedItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "camera_id", referencedColumnName = "id", nullable = true)
    private Camera camera;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sound_id", referencedColumnName = "id", nullable = true)
    private Sound sound;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "light_id", referencedColumnName = "id",nullable = true)
    private Light light;

    @Column
    private LocalDate dateStart;
    @Column
    private LocalDate dateEnd;

    private int howManyDaysToRent;

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
