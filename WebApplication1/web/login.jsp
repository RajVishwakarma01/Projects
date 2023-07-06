<html>
<head>     
<%@include file="mymenu1.jsp"%>
</head>
<body>
<div id="data">
<center>
<% 
String s=request.getParameter("s1");
if(s!=null)
{
%>
<%=s%>
<%}%>

<form action="login1.jsp">

<table cellpadding="12">
<tr>
<td>Enter Name</td>
<td><input type="text" placeholder="Enter Name" name="un" class="A"></td>
</tr>
<tr>
<td>Enter Pass</td>
<td><input type="password" placeholder="Enter password" name="up" class="A"></td>
</tr>

<tr>
<th colspan="2"><input type="submit" class="B" value="Login"></th>
</tr>

</table>
</form>
</center>
</div>
</body>
</html>