package com.example.service;

import com.example.dao.project_repository;
import com.example.entity.project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class project_service {

    @Autowired
    project_repository project_repository;

    public List<project> getData(){
        return project_repository.findAll();
    }
}
