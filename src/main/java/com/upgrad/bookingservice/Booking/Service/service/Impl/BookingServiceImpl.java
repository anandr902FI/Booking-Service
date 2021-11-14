package com.upgrad.bookingservice.Booking.Service.service.Impl;


import com.upgrad.bookingservice.Booking.Service.dto.*;
import com.upgrad.bookingservice.Booking.Service.entity.BookingEntity;
import com.upgrad.bookingservice.Booking.Service.exception.BookingNotFoundException;
import com.upgrad.bookingservice.Booking.Service.exception.ClientException;
import com.upgrad.bookingservice.Booking.Service.mapper.BookingMapper;
import com.upgrad.bookingservice.Booking.Service.repository.BookingRepo;
import com.upgrad.bookingservice.Booking.Service.service.BookingSerice;
import com.upgrad.bookingservice.Booking.Service.utils.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingSerice {
    @Autowired
    private BookingRepo bookingRepo;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${paymentAppUrl}")
    private String paymentServiceUrl;


    @Override
    public BookingResponseDTO saveBooking(BookingRequestDTO bookingRequestDTO) {
        BookingEntity saveBooking = BookingMapper.convertDTOtoEntity(Utility.convertBookingRequestToResponseDTO(bookingRequestDTO));
        return BookingMapper.convertEntityToDTO(bookingRepo.save(saveBooking));

    }


    @Override
    public BookingResponseDTO savePaymentDetails(PaymentDTO paymentDTO) {
        Optional<BookingEntity> savedBookingDetails = bookingRepo.findById(paymentDTO.getBookingId());
        if (!savedBookingDetails.isPresent()) {
            throw new BookingNotFoundException("INVALID BOOKING ID");
        }

        BookingEntity savedBookedDetails = getBookingDetails(paymentDTO.getBookingId());
        PaymentResponseDTO paymentResponse=null;
        try {
            paymentResponse = restTemplate.postForObject(paymentServiceUrl, paymentDTO, PaymentResponseDTO.class);
        } catch (HttpClientErrorException e) {
            throw new ClientException("INVALID MODE OF PAYMENT");
        }
        savedBookedDetails.setTransactionId(paymentResponse.getTransactionId());
        return BookingMapper.convertEntityToDTO(bookingRepo.save(savedBookedDetails));


    }

    @Override
    public BookingEntity getBookingDetails(Integer bookingId) {

        return bookingRepo.findById(bookingId).get();


    }


}
