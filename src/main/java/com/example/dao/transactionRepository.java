package com.example.dao;

import com.example.dto.Dto;
import com.example.entity.transaction;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface  transactionRepository extends JpaRepository<transaction,Integer> {}

