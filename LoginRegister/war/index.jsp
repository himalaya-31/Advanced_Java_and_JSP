<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="pkg.RegisterEntity" %>   
<%@ page import="static pkg.OfyService.ofy" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test</title>
<script>
function validateForm(){
	var x = document.myForm.name.value;
	if(!isNaN(x)){
	alert("Name must be filled out");
    return false;
	}
}
function validateRegister(){
	var x = document.registerForm.nameRegister.value;
	<%=%>
}
</script>
</head>
<body>
For Login:<br>
<form name="myForm"	onsubmit="return validateForm()" method="post" >
Name: 
<input	type = "text"  name = "name" required><br>
Password: 
<input	type = "password"	name="password" required><br>
<input type="submit" value="Submit">
</form>
<br>
<br>
<br>
<hr>
<br>
<br>
For register:<br>
<form action=""  name = "registerForm" method = "post" onsubmit = "return validateRegister()">
Name: 
<input	id="nameLogin" type = "text" name = "nameRegister" required><br>
Password: 
<input	type = "password"	name="passwordRegister" required><br>
<button type = "submit" name = "register" >Register</button>
</form>
<br>
<br>
<p id = "demo"></p>
<br>
</body>
</html>