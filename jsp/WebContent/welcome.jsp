<html>
<head>
<title>Welcome</title>
<body>
	<h1>Welcome to JSP Web</h1>
	<h3>Welcome to arum's page!</h3>
	<h2>Scripting Tag</h2>
	
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