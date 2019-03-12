package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cg.service.custService;

@Controller
public class MyController {
	
	@Autowired
	custService service;
	

}
