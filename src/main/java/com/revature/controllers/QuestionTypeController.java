package com.revature.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.QuestionType;
import com.revature.services.QuestionTypeService;

@RestController
@RequestMapping("question-types")
public class QuestionTypeController {
	
	@Autowired
	private QuestionTypeService questionTypeService;
	
	@GetMapping("")
	public List<QuestionType> findAll() {
		return questionTypeService.findAll();
	}
	
	@GetMapping("/{id}")
	public QuestionType findById(@PathVariable int id) {
		return questionTypeService.findById(id);
	}
	
	@PostMapping
	public QuestionType save(@Valid @RequestBody QuestionType q) {
		return questionTypeService.save(q);
	}
}
