package com.javacourse.project.hibernateAndJpa.Entities;

import javax.persistence.*;
/* Data Access Business Service UI */
@Entity /* indicate that this is a database object */
@Table(name="city")
public class City {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	/* The @GeneratedValue annotation specifies how to generate values
	 *  for the given column. This annotation will help in creating
	 *   primary keys values according to the specified strategy.
	 *    The only thing we need to do is to add @GeneratedValue
	 *     annotation in the POJO class. 
	 * */
	
	@Column(name="name")
	private String name;
	@Column(name="countrycode")
	private String countryCode;
	@Column(name="district")
	private String district;
	@Column(name="population")
	private int population;
	public City(int id, String name, String countryCode, String district, int population) {
		super();
		this.id = id;
		this.name = name;
		this.countryCode = countryCode;
		this.district = district;
		this.population = population;
	}
	public City() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}

	

}
