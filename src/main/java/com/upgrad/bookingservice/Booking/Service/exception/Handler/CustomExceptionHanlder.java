package com.upgrad.bookingservice.Booking.Service.exception.Handler;

import com.upgrad.bookingservice.Booking.Service.dto.ErrorResponse;
import com.upgrad.bookingservice.Booking.Service.exception.BookingNotFoundException;
import com.upgrad.bookingservice.Booking.Service.exception.ClientException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class CustomExceptionHanlder extends ResponseEntityExceptionHandler {


    private String BOOKING_NOT_FOUND = "INVALID BOOKING ID";


    @ExceptionHandler(value = BookingNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleBookingNotFound(BookingNotFoundException e, WebRequest r) {
        List<String> errorDetails = new ArrayList<String>();
        errorDetails.add(e.getLocalizedMessage());
        ErrorResponse response = new ErrorResponse(BOOKING_NOT_FOUND, errorDetails);
        return new ResponseEntity(errorDetails, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(value= ClientException.class)
    public ResponseEntity<ErrorResponse> handleClientException(ClientException e, WebRequest r) {
        List<String> errorDetails = new ArrayList<String>();
        errorDetails.add(e.getLocalizedMessage());
        ErrorResponse response = new ErrorResponse(BOOKING_NOT_FOUND, errorDetails);
        return new ResponseEntity(errorDetails, HttpStatus.BAD_REQUEST);
    }

}
