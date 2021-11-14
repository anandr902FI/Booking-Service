package com.upgrad.bookingservice.Booking.Service.exception;

public class ClientException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public ClientException(String errorMessage){
        super(errorMessage);
    }

}
