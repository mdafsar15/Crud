package com.genx.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.genx.crud.model.Crud;

@Repository
public interface CrudRepo extends JpaRepository<Crud, Long> {

	Crud findById(Crud crud);
}
