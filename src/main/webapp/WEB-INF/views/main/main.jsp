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
    
    
    <hr>
    
    
    <hr>
    
    
    <hr>
    
    <h3>5. 직원 정보 삭제 </h3>
    <p>(삭제하고자 하는 직원의 사번을 입력해주세요.)</p>
    <form action="${ pageContext.servletContext.contextPath }/employee/delete" method="post">
        사번 : <input type="text" name="empId">
        <button type="submit">직원 정보 삭제</button>
    </form>

</body>
</html>
