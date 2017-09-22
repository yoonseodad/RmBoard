<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>학교  상세 보기</title>
</head>
<body>

<center>
<h1>학교  상세 보기</h1>
<a href="logout_proc.jsp">Log-out</a>
<hr />
<form action="" method="post">
<input type="hidden" name="s_seq" value="${school.s_seq }" />
	<table border="1" cellspacing="0" cellpadding="0">
		<tr>
			<td bgcolor="orange" width="70">학년</td>
			<td align="left"><input name="s_grade" type="text" value="${school.s_grade }" /></td>
		</tr>
		<tr>
			<td bgcolor="orange" width="70">힉교이름</td>
			<td align="left">${school.s_name }</td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="글 수정" /></td>
		</tr>
	</table>
</form>
<hr />
<a href="reg.ricemen">글 등록</a>&nbsp;&nbsp;&nbsp;
<a href="delete.ricemen?seq=${school.s_seq }">글 삭제</a>&nbsp;&nbsp;&nbsp;
<a href="list.ricemen">글 목록</a>&nbsp;&nbsp;&nbsp;
</center>

</body>
</html>