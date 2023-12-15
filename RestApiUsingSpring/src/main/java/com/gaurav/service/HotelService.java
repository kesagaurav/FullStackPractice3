package com.gaurav.service;

import com.gaurav.exception.HotelNotFoundException;
import com.gaurav.model.Hotel;
import java.util.*;
public interface HotelService {

	Hotel createHotel(Hotel h) throws HotelNotFoundException;
	Hotel getById(int id) throws HotelNotFoundException;
	List<Hotel> getAllHotels() throws HotelNotFoundException;
	void deleteById(int id) throws HotelNotFoundException;
	Hotel update(Hotel h,int id) throws HotelNotFoundException;
	
}
