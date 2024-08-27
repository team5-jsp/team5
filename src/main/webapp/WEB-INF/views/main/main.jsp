<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
    <style>
        body {
            margin-left: 100px;
            margin-right: 100px;
        }
    </style>
</head>
<body>
    <jsp:include page="../common/header.jsp"/>

    <hr>

    <h3>1. 전체 직원 정보 조회</h3>
    <p>(재직중인 직원만 조회됩니다.)</p>
    <button type="button" class="btn btn-dark" onclick="location.href='${pageContext.servletContext.contextPath}/employee/list'">전체 직원정보 조회하기</button>
    
    <hr>
    <h3>2. 직원 정보 조회</h3>
    <p>(조회할 직원의 사번을 입력하세요.)</p>
    <form action="select/one" method="post">
        <label>사번 : </label>
        <input type="number" name="empId" value="empId">
        <button type="submit" class="btn btn-dark">조회하기</button>
    </form>
    
    <hr>

    <h3>3. 신규 직원 정보 추가</h3>
    <form action="${ pageContext.servletContext.contextPath }/employee/insert" method="post">
        <table>
            <tr>
                <td>직원명 : </td>
                <td><input type="text" name="empName"></td>
            </tr>
            <tr>
                <td>주민등록번호 : </td>
                <td><input type="text" name="empNo"></td>
            </tr>
            <tr>
                <td>이메일 : </td>
                <td><input type="email" name="email"></td>
            </tr>
            <tr>
                <td>전화번호 : </td>
                <td><input type="tel" name="phone"></td>
            </tr>
            <tr>
                <td>부서코드 : </td>
                <td>
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
                </td>
            </tr>
            <tr>
                <td>직급코드 :</td>
                <td>
                    <select name="jobCode">
                        <option value="J1">대표</option>
                        <option value="J2">부사장</option>
                        <option value="J3">부장</option>
                        <option value="J4">차장</option>
                        <option value="J5">과장</option>
                        <option value="J6">대리</option>
                        <option value="J7">사원</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>급여등급 : </td>
                <td>
                    <select name="salLevel">
                        <option value="S1">S1</option>
                        <option value="S2">S2</option>
                        <option value="S3">S3</option>
                        <option value="S4">S4</option>
                        <option value="S5">S5</option>
                        <option value="S6">S6</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>급여 : </td>
                <td><input type="number" name="salary"></td>
            </tr>
            <tr>
                <td>보너스율 : </td>
                <td><input type="text" name="bonus"></td>
            </tr>
            <tr>
                <td>관리자 사번 : </td>
                <td><input type="text" name="managerId"></td>
            </tr>
            <tr>
                <td>입사일 : </td>
                <td><input type="date" name="hireDate"></td>
            </tr>
        </table>
        <button type="submit" class="btn btn-success" style="margin-left: 200px;">등록하기</button>
    </form>

    <hr>
    <h3>4. 직원 정보 수정</h3>
    <p>(재직 -> 퇴직)</p>
    <form action="${ pageContext.servletContext.contextPath }/employee/update" method="post">
        사번 : <input type="text" name="empId"><br>
        퇴사일 : <input type="date" name="entDate">
        <button type="submit" class="btn btn-warning">직원퇴사</button>
    </form>

    <hr>
    
    <h3>5. 직원 정보 삭제 </h3>
    <p>(삭제하고자 하는 직원의 사번을 입력해주세요.)</p>
    <form action="${ pageContext.servletContext.contextPath }/employee/delete" method="post">
        사번 : <input type="text" name="empId">
        <button type="submit" class="btn btn-danger">직원 정보 삭제</button>
    </form>

</body>
</html>
