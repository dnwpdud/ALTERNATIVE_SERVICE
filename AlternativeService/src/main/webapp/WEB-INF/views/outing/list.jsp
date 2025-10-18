<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>outingList</title>
</head>
<body>
				<c:forEach var="outingList" items="${outingVo}">
					<tr>
						<td>${outingVo.outingId}</td>
						<td>${outingVo.serviceNo}</td>
						<td>${outingVo.memberName}</td>
						<td>${outingVo.outingType}</td>
						<td>${outingVo.outingDate}</td>
						<td>${outingVo.dayOfWeek}</td>
						<td>${outingVo.remarks}</td>
					</tr>
				</c:forEach>
</body>
</html>