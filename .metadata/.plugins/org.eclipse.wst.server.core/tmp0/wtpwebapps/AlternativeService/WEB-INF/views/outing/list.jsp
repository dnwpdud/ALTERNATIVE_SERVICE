<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>달력 테스트</title>

    <!-- jQuery -->
    <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
    <!-- jQuery UI -->
    <script src="https://code.jquery.com/ui/1.13.2/jquery-ui.min.js"></script>
    <link rel="stylesheet" href="https://code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">

    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin-top: 50px;
        }
        input[type="date"] {
            font-size: 16px;
            padding: 8px;
            margin: 5px;
        }
        button {
            padding: 8px 16px;
            font-size: 16px;
        }
    </style>
</head>
<body>

    <!-- 단일 날짜 검색 -->
    <form id="singleDateForm" action="detail" method="get">
        <label for="outingDate">날짜 선택:</label>
        <input type="date" id="outingDate" name="outingDate" required>
    </form>

    <hr>

    <!-- 기간 검색 -->
    <form id="rangeDateForm" action="detailRange" method="get">
        <label for="startDate">시작 날짜:</label>
        <input type="date" id="startDate" name="startDate" required>
        
        <label for="endDate">끝 날짜:</label>
        <input type="date" id="endDate" name="endDate" required>
        
        <button type="submit">검색</button>
    </form>

<script>
  // 단일 날짜 선택 시 바로 제출
  const singleForm = document.getElementById('singleDateForm');
  const outingDateEl = document.getElementById('outingDate');
  outingDateEl.addEventListener('change', function() {
    if (this.value) {
      singleForm.submit();
    }
  });

  // 기간 검색 시 날짜 유효성 체크
  const rangeForm = document.getElementById('rangeDateForm');
  rangeForm.addEventListener('submit', function(e) {
    const start = document.getElementById('startDate').value;
    const end = document.getElementById('endDate').value;
    if (start && end && start > end) {
      alert('시작 날짜가 끝 날짜보다 늦을 수 없습니다.');
      e.preventDefault();
    }
  });
</script>

</body>
</html>
