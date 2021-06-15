package com.example.craftdemo.service.impl;

import org.springframework.stereotype.Service;

import com.example.craftdemo.model.Operation;
import com.example.craftdemo.service.OperationService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class OperationServiceImpl implements OperationService {
	
	
	
	 @Override
	 public Operation performOperation(Operation dto){
	    	StringBuilder sb = new StringBuilder();
	    	String target = dto.getString_to_cut();
	    	for(int i = 2; i<target.length(); i=i+3) {
	    		sb.append(target.charAt(i));
	    	}
	    	log.info("Return string is {}",sb.toString());
	    	dto.setReturn_string(sb.toString());
	        return dto;
	 }
}