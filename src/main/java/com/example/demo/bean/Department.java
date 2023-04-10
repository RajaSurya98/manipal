package com.example.demo.bean;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="department")
public class Department {
@Id
@GeneratedValue
private int eid;
@Column
private String firstName;
@Column
private String lastName;
@OneToMany(cascade = CascadeType.ALL)
private List<Employee> emps;

public List<Employee> getEmps() {
	return emps;
}
public void setEmps(List<Employee> emps) {
	this.emps = emps;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
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

}
