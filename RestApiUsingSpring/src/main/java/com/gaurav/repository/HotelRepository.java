package com.gaurav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gaurav.model.Hotel;
@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}
