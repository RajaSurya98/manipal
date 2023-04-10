package com.example.demo.bean;

import jakarta.persistence.*;

@Entity
@Table(name="emp551")
public class Employee {
@Id
private int eid;
@Column
private String ename;
@Column
private int esal;
@OneToOne
@JoinColumn(referencedColumnName = "eid")
private Department dept;

public Department getDept() {
	return dept;
}
public void setDept(Department dept) {
	this.dept = dept;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getEsal() {
	return esal;
}
public void setEsal(int esal) {
	this.esal = esal;
}

}
