<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    
    <h3>1. 전체 직원 정보 조회</h3>
    <p>(재직중인 직원만 조회됩니다.)</p>
    <button onclick="location.href='${pageContext.servletContext.contextPath}/employee/list'">전체 직원정보 조회하기</button>
    
    <hr>
    <form action="select/one" method="post">
        <label>조회할 사번</label>
        <input type="number" name="empId" value="empId">
        <button type="submit">조회하기</button>
    </form>
    
    <hr>

    <h3>3. tbl_employee 테이블에서 신규 직원 정보 추가하기</h3>
    <form action="${ pageContext.servletContext.contextPath }/employee/insert" method="post">
        직원명 : <input type="text" name="empName"><br>
        주민등록번호 : <input type="text" name="empNo"><br>
        이메일 : <input type="email" name="email"><br>
        전화번호 : <input type="tel" name="phone"><br>
        부서코드 :
        <select name="deptCode">
            <option value="D1">인사관리부</option>
            <option value="D2">회계관리부</option>
            <option value="D3">마케팅부</option>
            <option value="D4">국내영업부</option>
            <option value="D5">해외영업1부</option>
            <option value="D6">해외영업2부</option>
            <option value="D7">해외영업3부</option>
            <option value="D8">기술지원부</option>
            <option value="D9">총무부</option>
        </select>
        <br>
        직급코드 :
        <select name="jobCode">
            <option value="J1">대표</option>
            <option value="J2">부사장</option>
            <option value="J3">부장</option>
            <option value="J4">차장</option>
            <option value="J5">과장</option>
            <option value="J6">대리</option>
            <option value="J7">사원</option>
        </select>
        <br>
        급여등급 :
        <select name="salLevel">
            <option value="S1">S1</option>
            <option value="S2">S2</option>
            <option value="S3">S3</option>
            <option value="S4">S4</option>
            <option value="S5">S5</option>
            <option value="S6">S6</option>
        </select>
        <br>
        급여 : <input type="number" name="salary"><br>
        보너스율 : <input type="text" name="bonus"><br>
        관리자사번 : <input type="text" name="managerId"><br>
        입사일 : <input type="date" name="hireDate"><br>
        <button type="submit">등록하기</button>
    </form>
<hr>
    <h3>4. tbl_employee 테이블에서 직원 정보 수정</h3>
    <p>(직원 퇴사시키기) : POST /employee/update</p>
    <form action="${ pageContext.servletContext.contextPath }/employee/update" method="post">
        사번 : <input type="text" name="empId"><br>
        퇴사일 : <input type="date" name="entDate"><br>
        <button type="submit">직원퇴사</button>
    </form>

    <hr>
    
    <h3>5. 직원 정보 삭제 </h3>
    <p>(삭제하고자 하는 직원의 사번을 입력해주세요.)</p>
    <form action="${ pageContext.servletContext.contextPath }/employee/delete" method="post">
        사번 : <input type="text" name="empId">
        <button type="submit">직원 정보 삭제</button>
    </form>

</body>
</html>
