<%@page import="java.sql.*"%>

<html>
    <body>
          <%@include file="mymenu2.jsp"%>
          
          <div id="mydata">
              <center> 
<form action="delete.jsp">
    
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
st.executeUpdate("delete from insmarks where URNO='"+s11+"'");

con.close();
}
catch(Exception e)
{
    out.println(e);
}}

%>

</center>
</body>
</html>
