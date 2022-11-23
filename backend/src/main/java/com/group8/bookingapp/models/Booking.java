package com.group8.bookingapp.models;

import java.sql.Date;

public class Booking {

    private long id;
    private Date dateStart;
    private Date dateEnd;
    private long bookedItemsId;

    public Booking(Date dateStart, Date dateEnd, long bookedItemsId) {
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.bookedItemsId = bookedItemsId;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public long getBookedItemsId() {
        return bookedItemsId;
    }

    public void setBookedItemsId(long bookedItemsId) {
        this.bookedItemsId = bookedItemsId;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", bookedItemsId=" + bookedItemsId +
                '}';
    }
}
