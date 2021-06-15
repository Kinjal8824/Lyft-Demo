package com.example.craftdemo.controller;

import static com.example.craftdemo.constants.ApplicationConstants.OPERATION_PATH;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.craftdemo.model.Operation;
import com.example.craftdemo.service.OperationService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping(OPERATION_PATH)
@RestController
public class Controller {
	
    private OperationService operationService;
    
    @Autowired
    public Controller(OperationService operationService) {
        this.operationService=operationService;
    }

	@PostMapping()
    public ResponseEntity<Object> addOperation(@RequestBody Operation input){
		log.info("String to be processed is {} ",input.getString_to_cut());
		input = operationService.performOperation(input);
        return new ResponseEntity<>(input, HttpStatus.OK);
    }
	
	
}
