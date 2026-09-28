package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="employee_master")
public class employee {

    @Id
    private int id;

    @Column(name="department")
    private String department_name;

    @Column(name="designation")
    private String designation;

    @Column(name="join_date")
    private Date join_date;
}
