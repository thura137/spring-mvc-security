package com.example.demospringsecutiry.dao;

import com.example.demospringsecutiry.ds.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentDao extends CrudRepository<Department,Integer> {
}
