<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sugestões</title>
</head>
<body>
	<form method="post" action="mostrarSugestao" >
		<table>
			<tr>
				<td>Nome:</td>
				<td><input type="text" size="20" id="nome" name="nome" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Logar" /></td>
			</tr>
		</table>
	</form>	
</body>
</html>