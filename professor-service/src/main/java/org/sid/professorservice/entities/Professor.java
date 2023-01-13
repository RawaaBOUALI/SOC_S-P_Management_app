package org.sid.professorservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Professor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 	private String firstName;
 	private String LastName;
 	private String speciality;
 	private String email;
 	private String tel;
	public Professor(Long id, String firstName, String lastName, String speciality, String email, String tel) {
		super();
		this.id = id;
		this.firstName = firstName;
		LastName = lastName;
		this.speciality = speciality;
		this.email = email;
		this.tel = tel;
	}
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
    
	
}

