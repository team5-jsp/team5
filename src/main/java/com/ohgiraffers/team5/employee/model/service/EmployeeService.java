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
        return null;
    }

    /* 정은 */
    public String selectNewEmpId() {

        Connection con = getConnection();

        String newEmpId = empDAO.selectNewEmpId(con);

        close(con);

        return newEmpId;
    }

    public int insertEmp(EmployeeDTO emp) {

        Connection con = getConnection();

        int result = empDAO.insertEmp(con, emp);

        if (result > 0) {
            commit(con);
        } else {
            rollback(con);
        }

        close(con);

        return result;
    }
}

