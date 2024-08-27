package com.ohgiraffers.team5.employee.controller;

import com.ohgiraffers.team5.employee.model.dao.EmployeeDAO;
import com.ohgiraffers.team5.employee.model.dto.EmployeeDTO;

import java.util.List;

public class EmployeeService {

    private final EmployeeDAO empDAO;

    public EmployeeService() { empDAO = new EmployeeDAO(); }

    public List<EmployeeDTO> selectAllEmp() {
    }
}
