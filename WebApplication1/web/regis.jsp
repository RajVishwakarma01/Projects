<html>
     <script type="text/javascript" src="xyz.js">
</script>
    <body>
<%@include file="mymenu1.jsp"%>    
<div id="data">
<center>


<form action ="regis1.jsp" name="form1">


<table cellpadding="12">
<tr>
<td>Enter Name</td>
<td><input type="text" placeholder="Enter Name" name="username" class="A" id="t1">
<br>
<font id="s1"> </font>
</td>
</tr>
<tr>
<td>Enter Pass</td>
<td><input type="password" placeholder="Enter password" name="password" class="A" id="t2">
<br>
<font id="s2"> </font>
</td>
</tr>

<tr>
    <th colspan="2"><input type="button" class="B" value="Registration" onclick="demo()">
    </th>
</tr>

</table>
</form>
</center>
</div>
</body>
</html>