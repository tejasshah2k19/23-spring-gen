<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>InputCalc</title>
</head>
<body>

<h3>InputCalc</h3>

<form action="addition" method="post">
  N1:  <input type="text" name="n1"/><br><br>
  N2: <input type="text" name="n2"/><br><br>

	Choice :  Add :<input type="radio" name="choice" value="add"/><br> 
					 Sub:<input type="radio" name="choice" value="sub"/><br> 
					 Div:<input type="radio" name="choice" value="div"/><br> 
					 Mul:<input type="radio" name="choice" value="mul"/><br> 

  <input type="submit" value="Submit"/>
  
  
</form>
</body>
</html>