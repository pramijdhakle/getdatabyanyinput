package com.fujitsu.controller;

import com.fujitsu.model.Employee;
import com.fujitsu.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @PostMapping("/savedata")
    public ResponseEntity<Employee> saveData(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeService.saveData(employee));
    }

    @PostMapping("/getdatabyanyinput")
    public ResponseEntity<List<Employee>> getDataByAnyInput(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeService.getDataByAnyInput(employee));
    }

    @GetMapping("/welcome")
    public ResponseEntity<String> welcome(){
        return ResponseEntity.ok("welcome to csi");
    }


}
