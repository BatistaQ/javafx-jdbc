package com.project.javafxjdbc.model.dao;

import java.util.List;

import com.project.javafxjdbc.model.entities.Department;
import com.project.javafxjdbc.model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
}
