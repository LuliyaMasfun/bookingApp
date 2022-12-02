package com.group8.bookingapp.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String dateStart;
    @Column
    private String dateEnd;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bookedItems_id", referencedColumnName = "id")
    private BookedItems bookedItems;

    @OneToOne(mappedBy = "booking")
    private User user;


    public Booking() {
    }

    public Booking(Date dateStart, Date dateEnd, BookedItems bookedItems) {

        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.bookedItems = bookedItems;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public BookedItems getBookedItems() {
        return bookedItems;
    }

    public void setBookedItems(BookedItems bookedItems) {
        this.bookedItems = bookedItems;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", bookedItems=" + bookedItems +
                '}';
    }
}
