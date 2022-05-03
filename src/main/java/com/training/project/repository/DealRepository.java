package com.training.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.project.model.Deal;

public interface DealRepository extends JpaRepository<Deal,Integer>{

}
