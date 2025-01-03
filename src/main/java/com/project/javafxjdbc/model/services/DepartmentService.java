package com.project.javafxjdbc.model.services;

import com.project.javafxjdbc.model.dao.DaoFactory;
import com.project.javafxjdbc.model.dao.DepartmentDao;
import com.project.javafxjdbc.model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {

    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll(){
        return dao.findAll();
    }

    public void saveOrUpdate(Department obj){
        if (obj.getId() == null){
            dao.insert(obj);
        } else {
            dao.update(obj);
        }
    }
}