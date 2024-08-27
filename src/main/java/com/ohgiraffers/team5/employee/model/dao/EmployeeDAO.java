package com.ohgiraffers.team5.employee.model.dao;

import com.ohgiraffers.team5.employee.model.dto.EmployeeDTO;

import java.sql.*;
import java.util.List;
import java.util.Properties;

import static com.ohgiraffers.team5.common.jdbc.JDBCTemplate.close;

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

    public int deleteEmp(Connection con, String empId) {
        PreparedStatement pstmt = null;

        int result = 0;

        String query = prop.getProperty("deleteEmp");

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, empId);

            result = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }

        return result;
    }
}
