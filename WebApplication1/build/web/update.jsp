<%@page import="java.sql.*"%>



<html>
    <body>
          <%@include file="mymenu2.jsp"%>
          
          <div id="mydata">
              <center> 
<form action="update.jsp">
    
    <table cellpadding="12">
  
   
<tr>
<td>Enter RNO</td>
<td><input type="text" placeholder="Search" name="n11" class="A"></td>
</tr>


<tr>
<th colspan="2"><input type="submit" class="B" name="b1" value="Search"></th>
</tr>

</table>
</form>
<%
    String s1=request.getParameter("b1");
    
    if(s1!=null){
        
          String s11=request.getParameter("n11");
     
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql:///abhidb?allowPublicKeyRetrieval=true&useSSL=false","root","root");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select *from insmarks where URNO='"+s11+"'");

if(rs.next())
{
%>

<form action="update.jsp">
    <table cellpadding="12">
<tr>
<td>URNO</td>
<td><input type="text" value=<%=rs.getString(1)%> name="n1"></td>
</tr>
<tr>
    <td>UNAME</td>
    <td><input type="text" value=<%=rs.getString(2)%> name="n2"></td>
</tr>

<tr>
    <td>UPHY</td>
    <td><input type="text" value=<%=rs.getString(3)%> name="n3"></td>
</tr>

<tr>
    <td>UCHE</td>
    <td><input type="text" value=<%=rs.getString(4)%> name="n4"></td>
</tr>

<tr>
    <td>UMATHS</td>
    <td><input type="text" value=<%=rs.getString(5)%> name="n5"></td>
</tr>

<tr>
<th colspan="2"><input type="submit" class="B" name="b2" value="Update"></th>
</tr>



</table>
</form>

              <%
              
  }
else{
    out.println("Invalid Roll No.");
}

con.close();
}
catch(Exception e1)
{
out.println(e1);
}}
%>
</center>
</body>
</html>

<%
    String s2=request.getParameter("b2");
    if(s2!=null)
    {
    String s21 = request.getParameter("n1");
    String s22 = request.getParameter("n2");
    String s23 = request.getParameter("n3");
    String s24 = request.getParameter("n4");
    String s25 = request.getParameter("n5");
    
    try
    {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql:///abhidb?allowPublicKeyRetrieval=true&useSSL=false","root","root");
	Statement st = con.createStatement();
	st.executeUpdate("update insmarks set UNAME='"+s22+"',UPHY='"+s23+"',UCHE='"+s24+"',UMATHS='"+s25+"' where URNO='"+s21+"'");
           
        response.sendRedirect("showall.jsp");
  	con.close();
		}
		catch(Exception e1)
		{
			out.println(e1);
		}

    }
    
    %>