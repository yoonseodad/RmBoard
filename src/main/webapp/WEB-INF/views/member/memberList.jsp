<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원 관리</title>
</head>
<body>
<center>
<h1>회원 관리</h1>
<h3>${userName}<a href="logout_proc.jsp">Log-out</a></h3>

<!-- 검색시작 
<form action="list.rm" method="post">
<table border="1" cellpadding="0" cellspacing="0" width="700">
	<td align="right">
		<select name="searchCondition">
 		<c:forEach items="${conditionMap }" var="option">
 			<option value="${option.value}">${option.key }</option>
 		</c:forEach>			
		</select>
		<input name="searchKeyword" type="text" />
		<input name="검색" type="submit" />
	</td>
</table>
</form>
검색종료 -->

<table border="1" cellpadding="0" cellspacing="0" width="700">
	<tr align="center" bgcolor="orange">
		<td width="80">번호</td>
		<td width="80">아이디</td>
		<td width="80">이름</td>
		<td width="180">E-Mail</td>
		<td width="100">가입일</td>
		<td width="80">탈퇴여부</td>
		<td width="100">탈퇴일</td>
	</tr>

<c:forEach items="${list}" var="member">
	<tr>
		<td>${member.mseq }</td>		
		<td align="left"><a href="modify.rm?seq=${member.mseq }">${member.id }</a></td>
		<td>${member.mname }</td>
		<td>${member.memail }</td>
		<td>${member.mregdate }</td>
		<td>${member.mdeleteyn }</td>
		<td>${member.mdeletedate }</td>
	</tr>
</c:forEach>
</table>
<br>
<a href="reg.rm">새 맴버 등록</a>
</center>
</body>
</html>