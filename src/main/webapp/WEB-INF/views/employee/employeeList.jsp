<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>무한상사 전체 직원 정보</h1>
    <p>해당 정보는 민감 정보이므로 보안에 신경써주시기 바랍니다 :-)</p>
    <table>
        <tr>
            <th>사원번호</th>
            <th>직원명</th>
            <th>주민등록번호</th>
            <th>이메일</th>
            <th>전화번호</th>
            <th>부서코드</th>
            <th>직급코드</th>
            <th>급여등급</th>
            <th>급여</th>
            <th>보너스율</th>
            <th>관리자사번</th>
            <th>입사일</th>
            <th>퇴사일</th>
            <th>퇴직여부</th>
        </tr>
        <c:forEach items="${ requestScope.empList }" var="emp">
            <tr>
                <td>${ emp.empId }</td>
                <td>${ emp.empName }</td>
                <td>${ emp.empNo }</td>
                <td>${ emp.email }</td>
                <td>${ emp.phone }</td>
                <td>${ emp.deptCode }</td>
                <td>${ emp.jobCode }</td>
                <td>${ emp.salLevel }</td>
                <td>${ emp.salary }</td>
                <td>${ emp.bonus }</td>
                <td>${ emp.managerId }</td>
                <td>${ emp.hireDate }</td>
                <td>${ emp.entDate }</td>
                <td>${ emp.entYn }</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
