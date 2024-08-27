package com.ohgiraffers.team5.employee.model.service;

import com.ohgiraffers.team5.employee.model.dao.EmployeeDAO;
import com.ohgiraffers.team5.employee.model.dto.EmployeeDTO;

import java.sql.Connection;
import java.util.List;

import static com.ohgiraffers.team5.common.jdbc.JDBCTemplate.*;

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

    public int deleteEmp(String empId) {

        Connection con = getConnection();

        int result = empDAO.deleteEmp(con, empId);

        if (result > 0) {
            commit(con);
        } else {
            rollback(con);
        }

        close(con);

        return result;
    }

    public EmployeeDTO SelectOneById(int empId) {
        Connection conn = getConnection();
        //System.out.println("커넥션 확인"+conn);

        EmployeeDTO result = empDAO.selectEmpById(conn,empId);
        //System.out.println(result);
        close(conn);

        return result;
    }
}
