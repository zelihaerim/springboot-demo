package com.javacourse.project.hibernateAndJpa.DataAccess;

import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.Entities.City;

/*
Hibernate JPA yi implement eder
*/
/* use Hibernate ORM */
@Repository
public class HibernateCityDAL implements ICityDAL {

	
	private EntityManager entityManager;
	
	@Override
	@Transactional /* Aspect Oriented Programming session open and close */
	public List<City> GetAll() {
		Session session = entityManager.unwrap(Session.class);
		List<City> cities=session.createQuery("from City",City.class).getResultList();
		return cities;
	}
	
	/* Automatically inject hibernate injection */
	@Autowired
	public HibernateCityDAL(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public void add(City city) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);
		
	}

	@Override
	public void update(City city) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);
	}

	@Override
	public void delete(City city) {
		Session session = entityManager.unwrap(Session.class);
		City cityToDelete=session.get(City.class,city.getId());
		session.delete(cityToDelete);
	}

	@Override
	public City getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		City city=session.get(City.class,id);
		return city;
	}
	
	
	
	
	
}
