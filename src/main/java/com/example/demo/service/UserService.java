package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.UserBean;
import com.example.demo.dao.UserDao;

@Service
public class UserService {
@Autowired
private UserDao udao;
public void addUser(UserBean ub)
{
	udao.save(ub);
	System.out.println("user data inserted successfully");
}
public List<UserBean> selectAll()
{
	return udao.findAll();
}
}
