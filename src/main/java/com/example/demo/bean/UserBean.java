package com.example.demo.bean;

import jakarta.persistence.*;

@Entity
@Table(name="user1")
public class UserBean {
@Id
@GeneratedValue
private int uid;
@Column
private String name;
@Column
private String pass;
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}


}
