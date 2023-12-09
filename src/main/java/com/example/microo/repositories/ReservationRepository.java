package com.example.microo.repositories;

import com.example.microo.entities.Reservation;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ReservationRepository extends JpaRepository <Reservation,Integer>{
    @Query("select r from Reservation r where r.nomR like :nomR")
   public Page<Reservation> reservationByNomR(@Param("nomR") String n, Pageable pageable);
}
