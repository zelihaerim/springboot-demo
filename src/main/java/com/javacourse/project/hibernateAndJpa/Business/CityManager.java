package com.javacourse.project.hibernateAndJpa.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.DataAccess.ICityDAL;
import com.javacourse.project.hibernateAndJpa.Entities.City;

@Service
public class CityManager implements ICityService{
	
	private ICityDAL cityDal;
	
	
	@Autowired
	public CityManager(ICityDAL cityDal) {
		this.cityDal = cityDal;
	}

	@Override
	@Transactional
	public List<City> getAll() {
		return cityDal.GetAll();
	}

	@Override
	@Transactional
	public void add(City city) {
		// you can make some rules, I mean you can add
		// business rules depends on customer.
		cityDal.add(city);
	}

	@Override
	@Transactional
	public void update(City city) {
		cityDal.update(city);
		
	}

	@Override
	@Transactional
	public void delete(City city) {
		cityDal.delete(city);
	}

	@Override
	@Transactional /* database function */
	public City getById(int id) {
		return cityDal.getById(id);
	}

}
