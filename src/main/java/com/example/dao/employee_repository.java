package com.example.dao;

import com.example.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employee_repository extends JpaRepository<employee, Integer>{ }
