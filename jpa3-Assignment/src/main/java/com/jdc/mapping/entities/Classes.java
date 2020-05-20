package com.jdc.mapping.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@Entity
public class Classes implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDate startDate;
	private LocalTime startTime;
	private LocalTime endTime;
	private double months;
	private int fees;
	@ElementCollection
	private List<Days> days;
	
	@ManyToOne
	private Course course;

	@OneToMany
	private List<Teacher> teachers;

	@ManyToOne
	private Teacher head;
	
	public enum Days {
		Mon, Tue, Wed, Thu, Fri, Sat, Sun
	}
}
