package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Department;
import com.example.demo.dao.AdminDao;

@Service
public class AdminService {
@Autowired
private AdminDao adao;
public void addDepartment(Department dpt)
{
	adao.save(dpt);
	System.out.println("Department is added successfully...");
}
}
