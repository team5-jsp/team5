package com.ohgiraffers.team5.employee.service;

import com.ohgiraffers.team5.employee.model.dao.EmployeeDAO;
import com.ohgiraffers.team5.employee.model.dto.EmployeeDTO;

public class EmployeeService {
    static final EmployeeDAO instance = new EmployeeDAO();


    public EmployeeDTO SelectOneById(String empId) {
        EmployeeDTO result=null;

        return result;
    }
}
