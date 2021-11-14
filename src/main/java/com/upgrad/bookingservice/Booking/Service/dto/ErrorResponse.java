package com.upgrad.bookingservice.Booking.Service.dto;

import org.springframework.http.HttpStatus;

import java.util.List;

public class ErrorResponse {
    private String message;
//     HttpStatus status;
    private List<String> errorDetails;

    public ErrorResponse(String message, List<String> errorDetails) {
        this.message = message;
//        this.status=status;
        this.errorDetails = errorDetails;
    }
}
