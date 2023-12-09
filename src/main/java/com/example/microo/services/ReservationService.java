package com.example.microo.services;

import com.example.microo.entities.Reservation;
import com.example.microo.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getAll() {
        return reservationRepository.findAll();
    }
    public Reservation addReservation(Reservation reservation){
        return reservationRepository.save(reservation);
    }
    public Reservation updateReservation(Reservation reservation){
        return reservationRepository.save(reservation);
    }

    public String deleteReservation(int id) {
        if (reservationRepository.findById(id).isPresent()) {
            reservationRepository.deleteById(id);
            return "reservation supprimé";
        } else
            return "reservation non supprimé";
    }
    public Reservation getReservationById(int id) {
        return reservationRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Reservation " + id + " INEXISTANT !!!"));
    }

    public boolean deleteById(int id) {
        reservationRepository.deleteById(id);
        return !(reservationRepository.existsById(id));
    }



}
