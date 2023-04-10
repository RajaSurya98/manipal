package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.UserBean;

@Repository
public interface UserDao extends JpaRepository<UserBean, Integer>{

}
