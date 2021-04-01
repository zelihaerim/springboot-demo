package com.javacourse.project.hibernateAndJpa.restAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacourse.project.hibernateAndJpa.Business.ICityService;
import com.javacourse.project.hibernateAndJpa.Entities.City;

@RestController
@RequestMapping("/api")
public class CityController {
	private ICityService cityService;

	@Autowired
	public CityController(ICityService cityService) {
		this.cityService = cityService;
	}
	@GetMapping("/cities")
	public List<City> get(){
		return cityService.getAll();	
	}
	@GetMapping("/cities/{id}")
	public City getById(@PathVariable int id){
		return cityService.getById(id);
		
	}
	
	
	@PostMapping("/add")
	public void add(@RequestBody City city){
		if(city==null) {
			return;
		}
		cityService.add(city);
		
	}
	
	@PostMapping("/update")
	public void update(@RequestBody City city){
		if(city==null) {
			return;
		}
		cityService.add(city);
		
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody City city){
		if(city==null) {
			return;
		}
		cityService.add(city);
		
	}
	

	
	
	
}
