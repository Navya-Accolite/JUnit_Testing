package com.example.au_demo_live.models;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeeService {

    private List<Employee> employee=new ArrayList<>();

    private List<Employee> employees;

    public List<Employee> getAllEmployees(){
        return employees;
    }

    public Employee getEmployee(String id) throws Exception {
        return employee
                .stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst()
                .orElseThrow(EmployeeNotFound::new);
    }
}