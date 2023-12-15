package com.gaurav.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.exception.HotelNotFoundException;
import com.gaurav.model.Hotel;
import com.gaurav.service.HotelService;

@RestController
//@Validated
@CrossOrigin(origins = "*")
public class HotelController {
	@Autowired
	private HotelService hserv;

	@PostMapping("/hotel")
	public ResponseEntity<Hotel> createHotel(@RequestBody @Valid Hotel h) throws HotelNotFoundException {
		// TODO Auto-generated method stub
		return new ResponseEntity<Hotel>(hserv.createHotel(h), HttpStatus.CREATED);
	}

	@GetMapping("/hotel/{id}")
	public ResponseEntity<Hotel> getById(@PathVariable int id) throws HotelNotFoundException {
		// TODO Auto-generated method stub
		return new ResponseEntity<Hotel>(hserv.getById(id), HttpStatus.OK);
	}

	@GetMapping("/hotels")
	public ResponseEntity<List<Hotel>> getAllHotels() throws HotelNotFoundException {
		// TODO Auto-generated method stub
		return new ResponseEntity<List<Hotel>>(hserv.getAllHotels(), HttpStatus.OK);
	}

	@DeleteMapping("hotel/{id}")
	public void deleteById(@PathVariable int id) throws HotelNotFoundException {
		// TODO Auto-generated method stub
		hserv.deleteById(id);
	}

	@PutMapping("/hotel/{id}")
	public ResponseEntity<Hotel> update(@RequestBody @Valid Hotel h, @PathVariable int id) throws HotelNotFoundException {
		// TODO Auto-generated method stub
		return new ResponseEntity<Hotel>(hserv.update(h, id), HttpStatus.OK);
	}

}
