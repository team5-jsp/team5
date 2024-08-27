package com.ohgiraffers.team5.employee.controller;

import com.ohgiraffers.team5.employee.model.dto.EmployeeDTO;
import com.ohgiraffers.team5.employee.model.service.EmployeeService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/employee/list")
public class SelectAllEmpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        EmployeeService empService = new EmployeeService();
        List<EmployeeDTO> empList = empService.selectAllEmp();

        for(EmployeeDTO emp : empList) {
            System.out.println(emp);
        }

        /* 조회 결과에 따른 뷰 */
        String path = "";
        if (empList != null) {
            path = "/WEB-INf/views/employee/list.jsp";
            req.setAttribute("empList", empList);
        } else {
            path = "/WEB-INf/common/errorPage.jsp";
            req.setAttribute("message", "전체 직원 조회를 실패했습니다.");
        }

        req.getRequestDispatcher(path).forward(req, resp);
    }
}
