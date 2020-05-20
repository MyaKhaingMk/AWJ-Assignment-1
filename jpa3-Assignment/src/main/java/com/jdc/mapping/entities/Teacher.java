package com.jdc.mapping.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Teacher implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String phone;
	private String email;
	
	@ManyToOne
	private Address address;

	@ManyToOne
	private Classes classes;

	@OneToMany
	private List<Classes> classAsHeadTeacher;
	
	public Teacher() {
		this.address = new Address();
	}
}
