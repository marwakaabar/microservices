package com.example.gestionhotel.services;

import com.example.gestionhotel.entity.Hotel;

import java.util.List;

public interface HotelService {
    List<Hotel> getHotels();

    Hotel getHotelbyId(Long id);

    Hotel addHotel(Hotel hotel);

    Hotel updateHotel(Hotel hotel, Long id);

    void deleteHotel(Long id);
}
