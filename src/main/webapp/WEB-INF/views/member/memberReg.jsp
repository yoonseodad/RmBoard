<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>신규 맴버 등록</title>
</head>
<body>

<center>
<h1>신규 맴버 등록</h1>
<a href="logout_proc.jsp">Log-out</a>
<hr />
<form action="reg.rm" method="post">
	<table border="1" cellspacing="0" cellpadding="0">
		<tr>
			<td bgcolor="orange" width="120">아이디</td>
			<td align="left"><input name="mid" type="text" /></td>
		</tr>
		<tr>
			<td bgcolor="orange" width="120">Password</td>
			<td align="left"><input name="mpassword" type="text" /></td>
		</tr>
		<tr>
			<td bgcolor="orange" width="120">Re Password</td>
			<td align="left"><input name="rempassword" type="text" /></td>
		</tr>
		<tr>
			<td bgcolor="orange" width="120">email</td>
			<td align="left"><input name="memail" type="text" size="10" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="회원 등록" /></td>
		</tr>
	</table>
</form>
<hr />
<a href="list.rm">맴버 목록</a>
</center>
<script>
</script>
</body>
</html>