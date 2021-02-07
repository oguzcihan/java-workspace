package com.example.hibernateAndjpa.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.hibernateAndjpa.Entities.City;

@Repository
public class HibernateCityDal implements ICityDal{

	private EntityManager entitymanager;
	
	@Autowired
	public HibernateCityDal(EntityManager entitymanager) {
		
		this.entitymanager = entitymanager;
	}

	@Override
	@Transactional
	public List<City> getAll() {
		
		Session session=entitymanager.unwrap(Session.class);
		List<City> cities=session.createQuery("From City",City.class).getResultList();
		return cities;
	}

	@Override
	public void add(City city) {
		Session session=entitymanager.unwrap(Session.class);
		session.saveOrUpdate(city);
		
	}

	@Override
	public void update(City city) {
		Session session=entitymanager.unwrap(Session.class);
		session.saveOrUpdate(city);
		
	}

	@Override
	public void delete(City city) {
		Session session=entitymanager.unwrap(Session.class);
		session.delete(city);
		
	}

	@Override
	public City getById(int id) {
		Session session=entitymanager.unwrap(Session.class);
		City city=session.get(City.class, id);
		return city;
		
	}

}
