package com.example.gestionhotel.controller;

import com.example.gestionhotel.entity.Hotel;
import com.example.gestionhotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @GetMapping
    public List<Hotel> getHotels() {
        return hotelService.getHotels();
    }

    @GetMapping("{id}")
    public Hotel getHotelbyId(@PathVariable Long id) {
        return hotelService.getHotelbyId(id);
    }

    @PostMapping
    public Hotel addHotel(@RequestBody Hotel hotel) {
        return hotelService.addHotel(hotel);
    }

    @PutMapping("{id}")
    public Hotel updateHotel(@RequestBody Hotel hotel, @PathVariable Long id) {
        return hotelService.updateHotel(hotel, id);
    }

    @DeleteMapping("{id}")
    public void deleteHotel(@PathVariable Long id) {
        hotelService.deleteHotel(id);
    }

}
