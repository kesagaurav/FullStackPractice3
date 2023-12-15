package com.gaurav.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaurav.exception.HotelNotFoundException;
import com.gaurav.model.Hotel;
import com.gaurav.repository.HotelRepository;
import com.gaurav.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService{
	@Autowired
	private HotelRepository hrepo;

	@Override
	public Hotel createHotel(Hotel h) throws HotelNotFoundException  {
		// TODO Auto-generated method stub
		return hrepo.save(h);
	}

	@Override
	public Hotel getById(int id) throws HotelNotFoundException {
		// TODO Auto-generated method stub
		if(hrepo.findById(id)!=null) {
			hrepo.findById(id);
		}
		return hrepo.findById(id).orElseThrow(()-> new HotelNotFoundException("hotel is not present with id " + id));
	}

	@Override
	public List<Hotel> getAllHotels() throws HotelNotFoundException {
		// TODO Auto-generated method stub
		return hrepo.findAll();
	}

	@Override
	public void deleteById(int id) throws HotelNotFoundException {
		// TODO Auto-generated method stub
		Hotel h=hrepo.findById(id).orElseThrow(()->new HotelNotFoundException("id is not found with this id " + id));
		hrepo.delete(h);
		
	}

	@Override
	public Hotel update(Hotel h,int id) throws HotelNotFoundException {
		// TODO Auto-generated method stub
		Hotel h1=this.hrepo.findById(id).orElseThrow(()-> new HotelNotFoundException("id is not found " + id));
		h1.setFoodName(h.getFoodName());
		h1.setFamily(h.getFamily());
		h1.setAmount(h.getAmount());
		h1.setRating(h.getRating());
		return hrepo.save(h1);
	}

}
