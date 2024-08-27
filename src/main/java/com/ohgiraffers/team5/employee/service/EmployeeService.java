package com.ohgiraffers.team5.employee.service;

import com.ohgiraffers.team5.employee.model.dao.EmployeeDAO;
import com.ohgiraffers.team5.employee.model.dto.EmployeeDTO;

import java.sql.Connection;

import static com.ohgiraffers.team5.common.jdbc.JDBCTemplate.close;
import static com.ohgiraffers.team5.common.jdbc.JDBCTemplate.getConnection;

public class EmployeeService {
    static final EmployeeDAO instance = new EmployeeDAO();


    public EmployeeDTO SelectOneById(int empId) {
        Connection conn = getConnection();
        //System.out.println("커넥션 확인"+conn);

        EmployeeDTO result = instance.selectEmpById(conn,empId);
        //System.out.println(result);
        close(conn);

        return result;
    }
}
