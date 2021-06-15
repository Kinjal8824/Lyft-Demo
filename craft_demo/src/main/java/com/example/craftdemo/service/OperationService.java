package com.example.craftdemo.service;

import org.springframework.stereotype.Service;

import com.example.craftdemo.model.Operation;

@Service
public interface OperationService {
	
	public Operation performOperation(Operation bid);
    
}