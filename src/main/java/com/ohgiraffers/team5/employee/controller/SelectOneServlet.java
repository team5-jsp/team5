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
public class SelectOneServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println("연결확인");
        
        //쿼리 진행
        EmployeeService service = new EmployeeService();
        EmployeeDTO result = service.SelectOneById(Integer.parseInt(req.getParameter("empId")));
        String url;

        //실패/성공에 따른 페이지 분리
        if(result != null){
            req.setAttribute("employee", result);
            url = "/WEB-INF/views/employee/showInfo.jsp";
        }
        else {
            req.setAttribute("message", "단일 조회에 실패했습니다.");
            url = "/WEB-INF/views/common/errorPage.jsp";
        }

        RequestDispatcher view = req.getRequestDispatcher(url);
        view.forward(req, resp);
    }
}
