<html>
<head>
<link rel="stylesheet" href="abc.css"/>
</head>
<body>
    <%@include file="mymenu2.jsp" %>
<center>

<div id="mydata">

        <form action="insert1.jsp">
<table cellpadding="12">
<tr>
<td>URNO</td>
<td><input type="text" placeholder="Enter Roll" name="URNO" class="A"></td>
</tr>

<tr>
<td>UNAME</td>
<td><input type="text" placeholder="Enter Name" name="UNAME" class="A"></td>
</tr>

<tr>
<td>UPHY</td>
<td><input type="text" placeholder="Enter phy" name="UPHY" class="A"></td>
</tr>

<tr>
<td>UCHE</td>
<td><input type="text" placeholder="Enter Che" name="UCHE" class="A"></td>
</tr>

<tr>
<td>UMATHS</td>
<td><input type="text" placeholder="Enter Maths" name="UMATHS" class="A"></td>

</tr>

<tr>
<th colspan="2"><input type="submit" class="B" value="Insert"></th>
</tr>

</table>
</center>
</div>
</form>
</body>
</html>