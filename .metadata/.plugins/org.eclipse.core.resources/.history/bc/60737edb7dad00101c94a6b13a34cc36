<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- head 안에 jQuery UI 달력 라이브러리 추가 -->
<link rel="stylesheet" href="https://code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
<title>Insert title here</title>
</head>
<body>
	
	<div class="board-section">
		<h1>게시판</h1>
		<!-- 글 작성 페이지 이동 버튼 -->
		<a href="register"><input type="button" value="글 작성"></a>
		
		<hr>
		
		<!-- ✅ 달력 영역 추가 -->
		<div style="text-align:center; margin-bottom:20px;">
			<h3>달력에서 날짜를 선택하세요</h3>
			<input type="text" id="calendar" readonly style="width:150px; text-align:center;">
		</div>
		
		<!-- ✅ 달력 날짜 전송용 form -->
		<form id="calendarForm" action="calendar" method="get">
			<input type="hidden" name="selectedDate">
		</form>
		
		<script type="text/javascript">
	$(document).ready(function(){
		
		// ✅ 달력 초기화
		$("#calendar").datepicker({
			dateFormat: "yy-mm-dd", // 날짜 형식 (yyyy-MM-dd)
			dayNamesMin: ['일','월','화','수','목','금','토'], // 요일 표시
			monthNames: ['1월','2월','3월','4월','5월','6월',
			             '7월','8월','9월','10월','11월','12월'],
			onSelect: function(dateText, inst) {
				// 날짜 클릭 시 실행
				var calendarForm = $("#calendarForm");
				calendarForm.find("input[name='selectedDate']").val(dateText);
				
				// ✅ Controller로 전송
				calendarForm.submit();
			}
		});
		
		/* 기존 이벤트 처리 코드들 (게시판 페이지네이션, 검색 등) 그대로 둠 */
		
	}); // end document()
</script>

</body>
</html>