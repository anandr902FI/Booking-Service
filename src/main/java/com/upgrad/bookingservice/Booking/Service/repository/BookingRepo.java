package com.upgrad.bookingservice.Booking.Service.repository;

import com.upgrad.bookingservice.Booking.Service.entity.BookingEntity;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepo extends CrudRepository<BookingEntity,Integer> {
}
