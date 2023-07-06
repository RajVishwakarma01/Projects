<%@page import="java.sql.*"%>



<html>
    <body>
          <%@include file="mymenu2.jsp"%>
          
          <div id="mydata">
              <center> 
<form action="search1.jsp">
    
    <table cellpadding="12">
  
   
<tr>
<td>Enter Name</td>
<td><input type="text" placeholder="Search" name="sea" class="A"></td>
</tr>


<tr>
<th colspan="2"><input type="submit" class="B" name="b1" value="Search"></th>
</tr>

</table>
</form>
<%
    String s1=request.getParameter("b1");
    
    if(s1!=null){
        
          String s11=request.getParameter("sea");
     
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql:///abhidb?allowPublicKeyRetrieval=true&useSSL=false","root","root");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select *from insmarks where URNO='"+s11+"'");

if(rs.next())
{
%>
    <table cellpadding="12">
<tr>
<td>Roll</td>
<td><%=rs.getString(1)%></td>
</tr>
<tr>
    <td>Name</td>
    <td><%=rs.getString(2)%></td>
</tr>

<tr>
    <td>UPHY</td>
    <td><%=rs.getString(3)%></td>
</tr>

<tr>
    <td>Chem</td>
    <td><%=rs.getString(4)%></td>
</tr>

<tr>
    <td>Maths</td>
    <td><%=rs.getString(5)%></td>
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