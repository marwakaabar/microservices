package com.example.gestionhotel.services.serviceImpl;

import com.example.gestionhotel.Repository.HotelRepository;
import com.example.gestionhotel.entity.Hotel;
import com.example.gestionhotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public List<Hotel> getHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotelbyId(Long id) {
        return hotelRepository.findById(id).orElseThrow(() -> new IllegalStateException("Hotel " + id + " not found"));
    }

    @Override
    public Hotel addHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel updateHotel(Hotel hotel, Long id) {
        if (hotelRepository.findById(id).isPresent()) {
            Hotel h1 = hotelRepository.findById(id).get();
            h1.setNomH(hotel.getNomH());
            h1.setAdresseh(hotel.getAdresseh());
            h1.setEmailH(hotel.getEmailH());
            h1.setTelH(hotel.getTelH());
            h1.setEtoilesH(hotel.getEtoilesH());
            return hotelRepository.save(h1);
        } else
            return null;
    }

    @Override
    public void deleteHotel(Long id) {
        hotelRepository.deleteById(id);
    }
}
