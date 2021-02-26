<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>Welcome</title>
</head>
<body>
	<nav class="navbar navbar-expand navbar-dark bg-dark">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="./welcome.jsp">Home</a><!-- 홈버튼 -->
			</div>
		</div>
	</nav>
	<%!String greeting="Welcome to Web";
	String tagline="Welcome to p";
	String n="a";%>
	<div class="jumbotron"><!-- 연한 회색 부분 -->
		<div class="container">
			<h1 class="display-3">
				<%=greeting %>
			</h1>
		</div>
	</div>
	<div class="container">
		<div class="text-center">
			<h3>
				<%=tagline %>
			</h3>
		</div>
		<hr>
	</div>
	<footer>
		<p>&copy;<%=n%></p>
	</footer>
	<%! int count=3;
	String makeItLower(String data){
		return data.toLowerCase();
	}%>
	<%
		for(int i=1;i<=count; i++){
			out.println("Java Server Pages "+i+".<br>");
		}
	%>
	<%=makeItLower("Hello World") %>
	
	<%--선언문 태그[메소드] --%>
	<%!int count1=0; %>
	<%--스크립틀릿태그 --%>
	<%
		out.println(++count1);//jsp화면 출력,전역변수 count1을 1 증가시킴
	%>
	
	<%!int data=50; %>
	<%
		out.println("Value of the variable is:"+data);
	%>
	
	<%!int sum(int a, int b){
		return a+b;
	}%>
	<%
		out.println("2+3="+sum(2,3));
	%>
	
	<%! String makeItH(String data){
		return data.toUpperCase();
	}%>
	<%
		out.println(makeItH("hi"));
	%>
	
	<p>Today's date: <%=new java.util.Date() %></p>
</body>
</head>
</html>