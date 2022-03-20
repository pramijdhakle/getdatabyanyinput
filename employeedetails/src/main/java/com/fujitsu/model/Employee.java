package com.fujitsu.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue
    private int employeeId;

    private String employeeName;
    private String employeeAddress;
    private long employeeMobNumber;
    private double employeeSalary;
    private String employeeCode;
}
