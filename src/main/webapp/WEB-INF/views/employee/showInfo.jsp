<%@ page import="com.ohgiraffers.team5.employee.model.dto.EmployeeDTO" %><%--
  Created by IntelliJ IDEA.
  User: min
  Date: 2024-08-27
  Time: 오전 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<h1> 조회된 사원 정보</h1>
<hr>
<div>
    <label>사번 :${employee.empId} </label><br>
    <label>이름 :${employee.empName} </label><br>
    <label>부서 코드 :${employee.deptCode} </label><br>
    <label>직급 코드 :${employee.jobCode} </label><br>
    <label>급여 :${employee.salary} </label><br>
</div>
</body>
</html>
