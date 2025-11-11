<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>로그인 페이지</title>
</head>
<body>

    <h1>로그인 페이지</h1>
    
    <!-- 로그인 폼 -->
    <form action="../auth/login" method="POST">
        <!-- 사용자명 입력 필드 -->
        <input type="text" name="username" ><br>
        <!-- 비밀번호 입력 필드 -->
        <input type="password" name="password" ><br>
        <!-- 로그인 버튼 -->
        <input type="submit" value="로그인">		
    </form>

</body>
</html>
