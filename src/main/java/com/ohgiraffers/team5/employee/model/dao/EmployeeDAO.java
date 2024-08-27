package com.ohgiraffers.team5.employee.model.dao;

import com.ohgiraffers.team5.common.config.ConfigLocation;
import com.ohgiraffers.team5.employee.model.dto.EmployeeDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.List;
import java.util.Properties;

import static com.ohgiraffers.team5.common.jdbc.JDBCTemplate.close;

public class EmployeeDAO {

    private final Properties prop;

    public EmployeeDAO() {
        prop = new Properties();
        try {
            prop.loadFromXML(new FileInputStream(ConfigLocation.MAPPER_LOCATION + "employee-mapper.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

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

    public EmployeeDTO selectEmpById(Connection conn, int empId) {
        PreparedStatement stmt = null;
        ResultSet rest = null;
        EmployeeDTO emp = null;
        String query = prop.getProperty("selectEmpById");

        System.out.println("쿼리문 " + query);

        try {
            stmt = conn.prepareStatement(query);

            stmt.setInt(1, empId);

            rest= stmt.executeQuery();
            emp = new EmployeeDTO();
            if(rest.next()){
                //결과값 반영 > 쿼리문에 없는 거 삭제
                System.out.println(rest);
                emp.setEmpId(rest.getString("emp_id"));
                emp.setEmpName(rest.getString("emp_name"));
                emp.setDeptCode(rest.getString("dept_code"));
                emp.setJobCode(rest.getString("job_code"));
                emp.setSalary(rest.getInt("salary"));

//                emp.setEmpNo(rest.getString("emp_no"));
//                emp.setEmail(rest.getString("email"));
//                emp.setPhone(rest.getString("phone"));
//                emp.setSalLevel(rest.getString("sal_level"));
//                emp.setBonus( rest.getDouble("bonus"));
//                emp.setManagerId(rest.getString("manager_id"));
//                emp.setHireDate(rest.getDate("hire_date"));
//                emp.setEntDate(rest.getDate("ent_date"));
//                emp.setEntYn( rest.getString("ent_yn"));
            }
            return emp;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        finally {
            close(rest);
            close(stmt);
        }
    }
}
