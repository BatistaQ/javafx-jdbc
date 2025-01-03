package com.project.javafxjdbc.model.dao;

import com.project.javafxjdbc.db.DB;
import com.project.javafxjdbc.model.dao.impl.DepartmentDaoJDBC;
import com.project.javafxjdbc.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
