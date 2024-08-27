<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
</head>
<body>
    <h1>무한상사 전체 직원 정보</h1>
    <p>해당 정보는 민감 정보이므로 보안에 신경써주시기 바랍니다 :-)</p>
    <table class="table table-striped">
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
