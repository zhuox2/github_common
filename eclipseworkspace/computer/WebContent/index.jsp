<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="result.jsp" method="post">
	<input type="text" name="firstname" >
	<br>
	<input type="text" name="lastname">
	<br>
	<input type="radio" name="way" value="1" >x
	<input type="radio" name="way" value="2">/
	<input type="radio" name="way" value="3">+
	<input type="radio" name="way" value="4">-	
	<%--input里面checked是默认选择哪个选项 --%>
	<input type="submit" value="计算">
</form>

</body>
</html>