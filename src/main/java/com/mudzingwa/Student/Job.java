package com.mudzingwa.Student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data

@Entity
@Table(name="job")
public class Job {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer jid;
	@Column(name="sala")
	private Double salary;
	@Column(name="title")
	private String tittle;
	@Column(name="nature")
	private String nature;
	@ManyToOne()
	private Student student;

}
