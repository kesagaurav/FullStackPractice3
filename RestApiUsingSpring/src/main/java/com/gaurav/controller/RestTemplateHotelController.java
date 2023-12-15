//package com.gaurav.controller;
//
//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.gaurav.exception.HotelNotFoundException;
//import com.gaurav.model.Hotel;
//import com.gaurav.service.HotelService;
//import com.gaurav.service.impl.RestTemplateHotelServiceImpl;
//
//@RestController
//@CrossOrigin
//public class RestTemplateHotelController {
//		@Autowired
//		private RestTemplateHotelServiceImpl service;
//	
//		@PostMapping("/hotel")
//	public Hotel createHotel(@RequestBody @Valid Hotel h) throws HotelNotFoundException {
//		// TODO Auto-generated method stub
//		return service.createHotel(h);
//	}
//
//		@GetMapping("/hotel/{id}")
//	public Hotel getById(@PathVariable int id) throws HotelNotFoundException {
//		// TODO Auto-generated method stub
//		return service.getById(id);
//	}
//		@GetMapping("/hotels")
//	public List<Hotel> getAllHotels() throws HotelNotFoundException {
//	
//		return service.getAllHotels();
//	}
//
//		@DeleteMapping("/hotel/{id}")
//	public void deleteById(int id) throws HotelNotFoundException {
//		service.deleteById(id);
//
//	}
//
//		@PutMapping("/hotel/{id}")
//	public Hotel update(@RequestBody @Valid Hotel h, @PathVariable int id) throws HotelNotFoundException {
//		
//
//		return service.update(h, id);
//	}
//
//}
