<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>소주s</title>
</head>
<body>
<%--  <%@ include file="include/menu.jsp"%>--%>
<jsp:include page="include/menu.jsp"/>
<%@ page import="java.util.ArrayList" %>
<%@page import="dto.Soju" %>
<jsp:useBean id="sojuDAO" class="dao.SojuRepository" scope="session"/>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">소주 목록</h1>
		</div>
	</div>
	<%
		ArrayList<Soju> listOfSojus=sojuDAO.getAllSojus();
	%>
	<div class="container">
		<div class="row" align="center">
			<%
				for(int i=0;i<listOfSojus.size();i++){
					Soju s=listOfSojus.get(i);
			%>
			<div class="col-md-4">
				<h3><%=s.getsName() %></h3>
				<p><%=s.getDescription() %></p>
				<p><%=s.getPer() %></p>
			</div>
			<%		
				}
			%>
		</div>
	</div>
	<jsp:include page="include/footer.jsp"></jsp:include>
</body>
</html>