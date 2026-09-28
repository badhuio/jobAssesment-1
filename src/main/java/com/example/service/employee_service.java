package com.example.service;

import com.example.dao.employee_repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class employee_service {

    private final employee_repository repository;

    public employee_service(employee_repository repository) {
        this.repository = repository;
    }

    public List<com.example.entity.employee> getData(){
        return repository.findAll();
    }
}
