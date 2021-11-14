package com.upgrad.bookingservice.Booking.Service.mapper;

import com.upgrad.bookingservice.Booking.Service.dto.BookingRequestDTO;
import com.upgrad.bookingservice.Booking.Service.dto.BookingResponseDTO;
import com.upgrad.bookingservice.Booking.Service.dto.PaymentResponseDTO;
import com.upgrad.bookingservice.Booking.Service.entity.BookingEntity;

public class BookingMapper {

    public static BookingResponseDTO convertEntityToDTO(BookingEntity bookingEntity){
            BookingResponseDTO tmpBookingResponseDto=new BookingResponseDTO();
            tmpBookingResponseDto.setBookingId(bookingEntity.getBookingId());
            tmpBookingResponseDto.setFromDate(bookingEntity.getFromDate());
            tmpBookingResponseDto.setToDate(bookingEntity.getToDate());
            tmpBookingResponseDto.setAdharNumber(bookingEntity.getAdharNumber());
            tmpBookingResponseDto.setRoomNumbers(bookingEntity.getRoomNumbers());
            tmpBookingResponseDto.setNumberOfRooms(bookingEntity.getNumberOfRooms());
            tmpBookingResponseDto.setRoomPrice(bookingEntity.getRoomPrice());
            tmpBookingResponseDto.setTransactionId(bookingEntity.getTransactionId());
            tmpBookingResponseDto.setBookedOn(bookingEntity.getBookedOn());
            return tmpBookingResponseDto;


    }

    public static BookingEntity convertDTOtoEntity(BookingResponseDTO bookingResponseDTO){
        BookingEntity tmpBookingEntity=new BookingEntity();
        tmpBookingEntity.setBookingId(bookingResponseDTO.getBookingId());
        tmpBookingEntity.setBookedOn(bookingResponseDTO.getBookedOn());
        tmpBookingEntity.setAdharNumber(bookingResponseDTO.getAdharNumber());
        tmpBookingEntity.setFromDate(bookingResponseDTO.getFromDate());
        tmpBookingEntity.setToDate(bookingResponseDTO.getToDate());
        tmpBookingEntity.setNumberOfRooms(bookingResponseDTO.getNumberOfRooms());
        tmpBookingEntity.setRoomNumbers(bookingResponseDTO.getRoomNumbers());
        tmpBookingEntity.setRoomPrice(bookingResponseDTO.getRoomPrice());
        tmpBookingEntity.setBookedOn(bookingResponseDTO.getBookedOn());
        tmpBookingEntity.setTransactionId(bookingResponseDTO.getTransactionId());
        return tmpBookingEntity;

    }
    public static BookingEntity convertDTOtoEntity(BookingResponseDTO bookingResponseDTO, PaymentResponseDTO clientResponse){
        BookingEntity tmpBookingEntity=new BookingEntity();
        tmpBookingEntity.setBookingId(bookingResponseDTO.getBookingId());
        tmpBookingEntity.setBookedOn(bookingResponseDTO.getBookedOn());
        tmpBookingEntity.setAdharNumber(bookingResponseDTO.getAdharNumber());
        tmpBookingEntity.setFromDate(bookingResponseDTO.getFromDate());
        tmpBookingEntity.setToDate(bookingResponseDTO.getToDate());
        tmpBookingEntity.setNumberOfRooms(bookingResponseDTO.getNumberOfRooms());
        tmpBookingEntity.setRoomNumbers(bookingResponseDTO.getRoomNumbers());
        tmpBookingEntity.setRoomPrice(bookingResponseDTO.getRoomPrice());
        tmpBookingEntity.setBookedOn(bookingResponseDTO.getBookedOn());
        tmpBookingEntity.setTransactionId(clientResponse.getTransactionId());
        return tmpBookingEntity;

    }
}
