package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.service.StudentService;

@RestController
@RequestMapping("/subject")
public class Subject {

	@Autowired
	private StudentService service;
	
	/*@PostMapping("/add-subject")
	public String addSubject(@RequestBody Subject subject ) {
		String msg = service.addSubject(subject);
		return msg;
		}
	
	@GetMapping("/get-all-subject")
	public List<Subject> getSubject(){
		return service.getSubject();
		
	}*/

}
