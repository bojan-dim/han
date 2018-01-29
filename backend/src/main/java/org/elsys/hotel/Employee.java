package org.elsys.hotel;

import javax.persistence.*;

@Entity
@Table(name = "employee")

public class Employee {

	private long id;
	private String name;
	private int salary;
	private String position;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	
	
	
}
