package com.fujitsu.dao;

import com.fujitsu.model.Employee;
import com.fujitsu.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDaoImpl {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee saveData(Employee employee) {
        return (Employee) employeeRepository.save(employee);
    }

    public List<Employee> getDataByAnyInput(Employee employee) {

        List<Employee> employeeList= new ArrayList<>();

        List<Employee> employees= employeeRepository.findAll();
        for (Employee ee : employees){
            if (ee.getEmployeeId()==employee.getEmployeeId() ||
            ee.getEmployeeName().equals(employee.getEmployeeName()) ||
            ee.getEmployeeAddress().equals(employee.getEmployeeAddress()) ||
            ee.getEmployeeMobNumber()==employee.getEmployeeMobNumber() ||
            ee.getEmployeeSalary()==employee.getEmployeeSalary() ||
            ee.getEmployeeCode().equals(employee.getEmployeeCode())){

                employeeList.add(ee);
            }
        }
        return employeeList;
    }
}
