package Entities.Concrete;

import Entities.Abstract.Entity;

public class User implements Entity{

	private int id;
	private String nationalityId;
	private String firstName;
	private String lastName;
	private int dateOfYear;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDateOfYear() {
		return dateOfYear;
	}
	public void setDateOfYear(int dateOfYear) {
		this.dateOfYear = dateOfYear;
	}
	
}
