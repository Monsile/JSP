<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산기 MVC01(뭔가 명품지갑 상표같다.mvc01..)</title>
</head>
<body>
<center>

<h2>계산기MVC01</h2>
<hr>
<form action="calservletmvc01" method="post" name="f1">

<input type="number" name="num1" width="12" size="10">
<select name="operator">
<option selected>+</option>
<option>-</option>
<option>*</option>
<option>/</option>
</select>

<input type="number" name="num2"width="12" size="10">
<input type="submit" value="계산" name="B1">
<input type="submit" value="다시 입력" name="reset">




</form>
</center>



</body>
</html>