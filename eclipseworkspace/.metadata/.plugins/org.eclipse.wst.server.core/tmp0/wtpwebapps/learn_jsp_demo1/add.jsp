<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String start =request.getParameter("start");
	String end =request.getParameter("end");
	int s = Integer.parseInt(start);
	int e = Integer.parseInt(end);
	int sum=0;
	for(int i=s;i<=e;i++)
	{
		sum=sum+i;
	}
%>
<%=sum %>
</body>
</html>