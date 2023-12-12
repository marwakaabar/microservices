package com.example.microo.controller;

import com.example.microo.entities.Reservation;
import com.example.microo.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("reservation")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @GetMapping
    public List<Reservation> getAll() {
        return reservationService.getAll();
    }
    @GetMapping("{id}")
    public Reservation getReservationbyId(@PathVariable int id) {
        return reservationService.getReservationById(id);
    }

    @PostMapping
    public Reservation addBlog(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    @PutMapping("{id}")
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }

    @DeleteMapping("{id}")
    public boolean deleteReservation(@PathVariable int id) {
        return reservationService.deleteById(id);
    }



}
