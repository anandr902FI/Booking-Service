package com.upgrad.bookingservice.Booking.Service.feign;

import com.upgrad.bookingservice.Booking.Service.dto.PaymentDTO;
import com.upgrad.bookingservice.Booking.Service.dto.PaymentResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "THEATRE-SERVICE")
public interface PaymentClient {

    @RequestMapping(value = "${paymentAppUrl}", method = RequestMethod.POST)
    public PaymentResponseDTO makePayment(@RequestBody PaymentDTO paymentDTO);

}
