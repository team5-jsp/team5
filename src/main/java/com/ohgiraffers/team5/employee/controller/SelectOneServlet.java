package com.ohgiraffers.team5.employee.controller;


import com.ohgiraffers.team5.employee.model.dto.EmployeeDTO;
import com.ohgiraffers.team5.employee.model.service.EmployeeService;
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
        String id = req.getParameter("empId");

        String url="";
        //사용자 입력이 없을 때
        if (id.isEmpty()) {
            req.setAttribute("message", "사번을 채워주세요.");
            url = "/WEB-INF/views/common/errorPage.jsp";
        }else {
            EmployeeDTO result = service.SelectOneById(Integer.parseInt(id));
            //실패/성공에 따른 페이지 분리
            if(result == null){
                req.setAttribute("message", "단일 조회에 실패했습니다. 다시 시도해주세요.");
                url = "/WEB-INF/views/common/errorPage.jsp";
            }
            else if(result.getEmpId() == null){
                req.setAttribute("message", "해당 사번의 사원이 존재하지 않습니다.");
                url = "/WEB-INF/views/common/errorPage.jsp";
            }
            else {
                req.setAttribute("employee", result);
                url = "/WEB-INF/views/employee/showInfo.jsp";
            }
        }

        RequestDispatcher view = req.getRequestDispatcher(url);
        view.forward(req, resp);
    }
}
