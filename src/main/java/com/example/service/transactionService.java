package com.example.service;

import com.example.dao.employee_repository;
import com.example.dao.project_repository;
import com.example.dao.transactionRepository;
import com.example.entity.employee;
import com.example.entity.transaction;
import com.example.entity.project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dto.Dto;

import java.util.List;

@Service
public class transactionService {

    @Autowired
    private transactionRepository transactionRepository;
    @Autowired
    private employee_repository employeeRepository;
    @Autowired
    private project_repository projectRepository;

    transaction data = new transaction();

    public Dto saveData(Dto dto) {

        data.setName(dto.getName());
        data.setLocation(dto.getLocation());

        employee employee = employeeRepository.getReferenceById(dto.getEmployeeId());
            data.setEmployee(employee);
        project project = projectRepository.getReferenceById(dto.getProjectId());
            data.setProject(project);

        System.out.println(data.getName());

        transaction entity = transactionRepository.save(data);



        dto.setName(entity.getName());
        dto.setLocation(entity.getLocation());

        return dto;
    }

}
