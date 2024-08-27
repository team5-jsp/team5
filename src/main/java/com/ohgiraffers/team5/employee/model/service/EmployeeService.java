package com.ohgiraffers.team5.employee.model.service;

import com.ohgiraffers.team5.employee.model.dao.EmployeeDAO;
import com.ohgiraffers.team5.employee.model.dto.EmployeeDTO;

import java.sql.Connection;
import java.util.List;

import static com.ohgiraffers.team5.common.jdbc.JDBCTemplate.close;
import static com.ohgiraffers.team5.common.jdbc.JDBCTemplate.getConnection;

public class EmployeeService {

    private final EmployeeDAO empDAO;

    public EmployeeService() { empDAO = new EmployeeDAO(); }

    public List<EmployeeDTO> selectAllEmp() {

        /* Connection */
        Connection con = getConnection();

        /* 비지니스 로직*/
        List<EmployeeDTO> empList = empDAO.selectAllEmpList(con);

        close(con);

        return empList;

    }
}
