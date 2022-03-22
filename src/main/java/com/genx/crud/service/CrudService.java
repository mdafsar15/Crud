package com.genx.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genx.crud.model.Crud;
import com.genx.crud.repository.CrudRepo;

@Service
public class CrudService {

	@Autowired
	CrudRepo crudRepo;

	public Crud crud(Crud crud) {
		return crudRepo.save(crud);
	}

}
