<%@page import="java.sql.*"%>
<%
    String s1=request.getParameter("URNO");
    String s2=request.getParameter("UNAME");
    String s3=request.getParameter("UPHY");
    String s4=request.getParameter("UCHE");
    String s5=request.getParameter("UMATHS");
    
try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql:///abhidb?allowPublicKeyRetrieval=true&useSSL=false","root","root");
	Statement st=con.createStatement();
        st.executeUpdate("insert into insmarks values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')");
response.sendRedirect("showall.jsp");

con.close();
}
catch(Exception e1)
{
out.println(e1);
}
%>