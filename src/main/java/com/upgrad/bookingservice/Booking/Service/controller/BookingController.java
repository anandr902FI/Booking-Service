package com.upgrad.bookingservice.Booking.Service.controller;


import com.upgrad.bookingservice.Booking.Service.dto.BookingRequestDTO;
import com.upgrad.bookingservice.Booking.Service.dto.BookingResponseDTO;
import com.upgrad.bookingservice.Booking.Service.dto.PaymentDTO;
import com.upgrad.bookingservice.Booking.Service.service.Impl.BookingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/hotel/v1")
public class BookingController {

    @Autowired
    private BookingServiceImpl bookingService;

    @PostMapping(value="/booking")
    public ResponseEntity<BookingResponseDTO> saveBooking(@RequestBody BookingRequestDTO bookingRequestDTO){

        BookingResponseDTO response = bookingService.saveBooking(bookingRequestDTO);
        return ResponseEntity.ok(response);

    }
    
    @PostMapping(value="/booking/{bookingId}/transaction")
    public ResponseEntity<BookingResponseDTO> savePayment(@RequestBody PaymentDTO paymentDTO, @PathVariable Integer bookingId){
        BookingResponseDTO responseDTO=bookingService.savePaymentDetails(paymentDTO);
        return ResponseEntity.ok(responseDTO);
    }
}
