package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Employee;
import com.example.demo.dao.EmployeeDao;

@Service
public class EmployeeService {
@Autowired
private EmployeeDao edao;
public void addEmployee(Employee emp)
{
	edao.save(emp);
	System.out.println("Employee inserted successfully...");
}
}
