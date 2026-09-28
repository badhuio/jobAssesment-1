package com.example.controller;
import com.example.dto.Dto;
import com.example.service.employee_service;
import com.example.service.project_service;
import com.example.service.transactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.project;

import java.util.List;

@RestController
public class employee {

    @Autowired
    private employee_service employee_service;
    @Autowired
    private project_service project_service;
    @Autowired
    private transactionService transactionService;

    Dto dto = new Dto();

    @GetMapping("/getData")
    public List<com.example.entity.employee> employees(){
       return employee_service.getData();
    }
    @GetMapping("/getProject")
    public List<project> getData(){
        return project_service.getData();
    }

    @PostMapping("/aveData")
    public Dto saveData(@RequestBody Dto dto){
        return transactionService.saveData(dto);
    }
}
