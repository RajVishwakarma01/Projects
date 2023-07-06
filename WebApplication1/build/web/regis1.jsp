<%@page import="java.sql.*"%>
<%
    String s1=request.getParameter("username");
    String s2=request.getParameter("password");
    
try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql:///abhidb?allowPublicKeyRetrieval=true&useSSL=false","root","root");
	Statement st=con.createStatement();
	
	st.executeUpdate("insert into login values('"+s1+"','"+s2+"')");
	response.sendRedirect("login.jsp");
        
	con.close();
}
catch(Exception e1)
{
out.println(e1);	
}
%>