<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록</title>
</head>
<body>
<%--  <%@ include file="include/menu.jsp"%>--%>
<jsp:include page="include/menu.jsp"/>
<%@ page import="java.util.ArrayList" %>
<%@page import="dto.Product" %>
<jsp:useBean id="productDAO" class="dao.ProductRepository" scope="session"/>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 목록</h1>
		</div>
	</div>
	<%
		ArrayList<Product> listOfProducts=productDAO.getAllProducts();
	%>
	<div class="container">
		<div class="row" align="center">
			<%
				for(int i=0;i<listOfProducts.size();i++){
					Product s=listOfProducts.get(i);
			%>
			<div class="col-md-4">
				<h3><%=s.getPname() %></h3>
				<p><%=s.getDescription() %></p>
				<p><%=s.getUnitPrice() %></p>
			</div>
			<%		
				}
			%>
		</div>
	</div>
	<jsp:include page="include/footer.jsp"></jsp:include>
</body>
</html>