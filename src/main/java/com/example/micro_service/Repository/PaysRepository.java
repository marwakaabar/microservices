package com.example.micro_service.Repository;

import com.example.micro_service.entities.Pay;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PaysRepository extends JpaRepository<Pay,Integer> {
    @Query("select p from Pay p where p.nom like :name")
    public Page<Pay> PaysByNom(@Param("name") String n, Pageable pageable);
}
