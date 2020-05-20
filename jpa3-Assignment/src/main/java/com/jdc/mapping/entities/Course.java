package com.jdc.mapping.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Course implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false, unique = true)
	private String name;
	private Level level;
	private int fees;
	private double duration;

	@OneToMany
	private List<Classes> classList;
	
	public enum Level {
		Basic, Intermediate, Advance
	}

}
