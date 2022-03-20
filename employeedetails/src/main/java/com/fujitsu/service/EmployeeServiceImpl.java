package com.fujitsu.service;

import com.fujitsu.dao.EmployeeDaoImpl;
import com.fujitsu.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeDaoImpl employeeDao;

    public Employee saveData(Employee employee) {
        return employeeDao.saveData(employee);
    }

    public List<Employee> getDataByAnyInput(Employee employee) {
        return employeeDao.getDataByAnyInput(employee);
    }
}
