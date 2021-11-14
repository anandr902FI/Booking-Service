package com.upgrad.bookingservice.Booking.Service.entity;



import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name ="booking", schema="RESTARTURANT", catalog="")
public class BookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "booking_id")
    private Integer bookingId;

    @Column(name="from_date",nullable = true)
    private LocalDate fromDate;

    @Column(name="to_date",nullable = true)
    private LocalDate toDate;

    @Column(name="adhar_number",unique = true,nullable = true)
    private String adharNumber;

    @Column(name="number_of_rooms")
    private Integer numberOfRooms;

    @Column(name="room_numbers")
    private String roomNumbers;

    @Column(name="room_price",nullable = false)
    private Integer roomPrice;

    @Column(name="transaction_id")
    private Integer transactionId;

    @Column(name="booked_on",nullable = true)
    private LocalDate bookedOn;

    @Override
    public String toString() {
        return "BookingEntity{" +
                "bookingId=" + bookingId +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", adharNumber='" + adharNumber + '\'' +
                ", numberOfRooms=" + numberOfRooms +
                ", roomNumbers='" + roomNumbers + '\'' +
                ", roomPrice=" + roomPrice +
                ", transactionId=" + transactionId +
                ", bookedOn=" + bookedOn +
                '}';
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public String getAdharNumber() {
        return adharNumber;
    }

    public void setAdharNumber(String adharNumber) {
        this.adharNumber = adharNumber;
    }

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(Integer numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getRoomNumbers() {
        return roomNumbers;
    }

    public void setRoomNumbers(String roomNumbers) {
        this.roomNumbers = roomNumbers;
    }

    public Integer getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Integer roomPrice) {
        this.roomPrice = roomPrice;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public LocalDate getBookedOn() {
        return bookedOn;
    }

    public void setBookedOn(LocalDate bookedOn) {
        this.bookedOn = bookedOn;
    }
}
