package com.ohgiraffers.team5.employee.controller;

import com.ohgiraffers.team5.employee.model.dto.EmployeeDTO;
import com.ohgiraffers.team5.employee.service.EmployeeService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/select/one")
public class SelectOneController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("연결확인");

        EmployeeService service = new EmployeeService();

        EmployeeDTO result = service.SelectOneById(req.getParameter("empId"));
        String url =null;
        if(result != null){
            url = "/WEB-INF/views/employee/showInfo.jsp";
        }
        else {
            url = "/WEB-INF/views/common/errorPage.jsp";
        }

        RequestDispatcher view = req.getRequestDispatcher(url);
        view.forward(req, resp);
    }
}
