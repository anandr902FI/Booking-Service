package com.upgrad.bookingservice.Booking.Service.service;

import com.upgrad.bookingservice.Booking.Service.dto.BookingRequestDTO;
import com.upgrad.bookingservice.Booking.Service.dto.BookingResponseDTO;
import com.upgrad.bookingservice.Booking.Service.dto.PaymentDTO;
import com.upgrad.bookingservice.Booking.Service.entity.BookingEntity;

public interface BookingSerice {

     BookingResponseDTO saveBooking(BookingRequestDTO bookingRequestDTO);

    BookingResponseDTO savePaymentDetails(PaymentDTO paymentDTO) ;
    BookingEntity getBookingDetails(Integer bookingId) ;

}
