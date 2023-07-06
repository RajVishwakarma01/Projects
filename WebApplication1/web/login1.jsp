<%@page import="java.sql.*"%>
<%
    String s1=request.getParameter("un");
    String s2=request.getParameter("up");
    
try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql:///abhidb?allowPublicKeyRetrieval=true&useSSL=false","root","root");
	Statement st=con.createStatement();
	
		ResultSet rs=st.executeQuery("select * from login where UNAME='"+s1+"' AND UPASS='"+s2+"'");
	if(rs.next())
        {
                response.sendRedirect("mymenu.jsp");
        }
        else
        {
            response.sendRedirect("login.jsp?s1=Invalid User Name and Password.");
        }
        
	con.close();
}
catch(Exception e1)
{
out.println(e1);	
}
%>