<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="vo.CalVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
    CalVO vo = (CalVO)request.getAttribute("vo");
    out.print(vo.getOp1() + " " + vo.getOp() + " " + vo.getOp2() + " = " + vo.getResult());
%>
</body>
</html>