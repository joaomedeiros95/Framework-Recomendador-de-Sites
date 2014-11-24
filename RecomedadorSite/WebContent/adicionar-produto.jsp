<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Adicionar Produto</title>
</head>
<body>
	<form method="post" action="adicionaProduto">
		<table>
			<tr>
				<td>Nome:</td>
				<td><input type="text" size="20" id="nome" name="nome" /></td>
			</tr>
			<tr>
				<td>Valor:</td>
				<td><input type="text" size="11" id="valor" name="valor" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Enviar" /></td>
			</tr>
		</table>
	</form>
</body>
</html>