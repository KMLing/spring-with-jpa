package com.solt.jdc.dao;

import com.solt.jdc.ds.Employee;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
}
