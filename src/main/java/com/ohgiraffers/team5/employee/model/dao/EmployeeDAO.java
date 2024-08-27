package com.ohgiraffers.team5.employee.model.dao;

import com.ohgiraffers.team5.employee.model.dto.EmployeeDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

public class EmployeeDAO {


    private final Properties prop;

    public EmployeeDAO() {

        prop = new Properties();

    }

    /* 전체 목록조회 */
    public List<EmployeeDTO> selectAllEmpList(Connection conn) {

        Statement stmt = null;
        ResultSet rest = null;

        List<EmployeeDTO> empList = null;

        String query = prop.getProperty("selectALlEmpList");

        return empList;
    }
}
