package com.genx.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.genx.crud.model.Crud;
import com.genx.crud.service.CrudService;

@RestController
@RequestMapping("/crud")
public class CrudController {

	@Autowired
	CrudService crudService;

	@PostMapping
	public Crud saveCrud(@RequestBody Crud crud) {
		return crudService.crud(crud);
	}
}
