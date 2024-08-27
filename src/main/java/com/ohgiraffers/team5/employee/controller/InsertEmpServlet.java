package com.ohgiraffers.team5.employee.controller;

import com.ohgiraffers.team5.employee.model.dto.EmployeeDTO;
import com.ohgiraffers.team5.employee.model.service.EmployeeService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/employee/insert")
public class InsertEmpServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String empName = req.getParameter("empName");
        String empNo = req.getParameter("empNo");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String deptCode = req.getParameter("deptCode");
        String jobCode = req.getParameter("jobCode");
        String salLevel = req.getParameter("salLevel");
        int salary = Integer.parseInt(req.getParameter("salary"));
        double bonus = Double.parseDouble(req.getParameter("bonus"));
        String managerId = req.getParameter("managerId");
        java.sql.Date hireDate = java.sql.Date.valueOf(req.getParameter("hireDate"));

        EmployeeService empService = new EmployeeService();
        String newEmpId = empService.selectNewEmpId();

        EmployeeDTO emp = new EmployeeDTO();
        if(newEmpId != null) emp.setEmpId(newEmpId);
        emp.setEmpName(empName);
        emp.setEmpNo(empNo);
        emp.setEmail(email);
        emp.setPhone(phone);
        emp.setDeptCode(deptCode);
        emp.setJobCode(jobCode);
        emp.setSalLevel(salLevel);
        emp.setSalary(salary);
        emp.setBonus(bonus);
        emp.setManagerId(managerId);
        emp.setHireDate(hireDate);

        System.out.println("insert request emp : " + emp);

        int result = empService.insertEmp(emp);

        System.out.println("result = " + result);
        String path = "";
        if(result > 0) {
            path = "/WEB-INF/views/common/successPage.jsp";
            //req.setAttribute("message", "신규 직원 등록에 성공하셨습니다!");
            //resp.sendRedirect(req.getContextPath() + "/WEB_INF/views/common/successPage.jsp");

            req.setAttribute("successCode", "insertEmp");
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            req.setAttribute("message", "신규 직원 등록에 실패하셨습니다..");
        }

        req.getRequestDispatcher(path).forward(req, resp);
    }
}
