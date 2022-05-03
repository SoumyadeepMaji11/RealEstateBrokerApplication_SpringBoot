package com.training.project.service;

import com.training.project.model.Deal;
import com.training.project.repository.DealRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dealService")
public class DealServiceImp implements DealService{
    
    @Autowired 
    DealRepository dealRepository;
    
    public void saveDeal(Deal deal){
        dealRepository.save(deal);
    }
}
