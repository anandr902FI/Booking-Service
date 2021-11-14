package com.upgrad.bookingservice.Booking.Service.utils;

import com.upgrad.bookingservice.Booking.Service.dto.BookingRequestDTO;
import com.upgrad.bookingservice.Booking.Service.dto.BookingResponseDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Utility {

    public static ArrayList<String> getRandomNumbers(int count) {
        Random rand = new Random();
        int upperBound = 100;
        ArrayList<String> numberList = new ArrayList<String>();

        for (int i = 0; i < count; i++) {
            numberList.add(String.valueOf(rand.nextInt(upperBound)));
        }

        return numberList;
    }

    public static BookingResponseDTO convertBookingRequestToResponseDTO(BookingRequestDTO bookingRequestDTO) {
        BookingResponseDTO tmpBookingResponseDto = new BookingResponseDTO();
        tmpBookingResponseDto.setFromDate(bookingRequestDTO.getFromDate());
        tmpBookingResponseDto.setToDate(bookingRequestDTO.getToDate());
        tmpBookingResponseDto.setAdharNumber(bookingRequestDTO.getAdharNumber());
        tmpBookingResponseDto.setRoomNumbers(String.
                join(", ", getRandomNumbers(bookingRequestDTO.getNumberOfRooms())));
        tmpBookingResponseDto.setNumberOfRooms(bookingRequestDTO.getNumberOfRooms());
        tmpBookingResponseDto.setRoomPrice(getRoomPrice(bookingRequestDTO.getNumberOfRooms()));
//        tmpBookingResponseDto.setTransactionId(bookingEntity.getTransactionId());
        tmpBookingResponseDto.setBookedOn(getCurrentDate());
        return tmpBookingResponseDto;
    }

    public static  Integer getRoomPrice(Integer numberOfRooms){
        return 1000*numberOfRooms;
    }

    public static LocalDate getCurrentDate(){

        return LocalDate.now();
    }
}
