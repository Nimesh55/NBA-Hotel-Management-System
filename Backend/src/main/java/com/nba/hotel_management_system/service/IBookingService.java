package com.nba.hotel_management_system.service;

import com.nba.hotel_management_system.model.BookedRoom;

import java.util.List;

public interface IBookingService {

    String saveBooking(Long roomId, BookedRoom bookingRequest);

    BookedRoom findByBookingConfirmationCode(String confirmationCode);

    List<BookedRoom> getAllBookings();

    void cancelBooking(Long bookingId);
}
