package com.example.spring.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Data
@Entity
public class Employee {

	@Id
	@GeneratedValue
	private int empId;
	@Size(min=3, max=10, message="Min 3 and max 10 charecters are allowed")
	private String empName;

	// OneToOne unidirectional relationship
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "email")
	private Login login;

	// OneToMany unidirectional relationship
	// @JsonIgnore
	@OneToMany(targetEntity = Address.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_addr_fk", referencedColumnName = "empId")
	private List<Address> address;

	@JsonIgnore
	// ManyToMany unidirectional relationship
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
	@JoinTable(name = "employees_skills", joinColumns = { @JoinColumn(name = "emp_id") }, inverseJoinColumns = {
			@JoinColumn(name = "skill_id") })
	private Set<Skill> skills;

}
