<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Adicionar Usuário</title>
</head>
<body>
	<form method="post" action="adicionaUsuario">
		<table>
			<tr>
				<td>Nome:</td>
				<td><input type="text" size="20" id="nome" name="nome" /></td>
			</tr>
			<tr>
				<td>CPF:</td>
				<td><input type="text" size="11" id="cpf" name="cpf" /></td>
			</tr>
			<tr>
				<td>RG:</td>
				<td><input type="text" size="20" id="rg" name="rg" /></td>
			</tr>
			<tr>
				<td>Telefone:</td>
				<td><input type="text" size="20" id="telefone" name="telefone" /></td>
			</tr>
			<tr>
				<td>Endereço:</td>
				<td><input type="text" size="30" id="end" name="end" /></td>
			</tr>
			<tr>
				<td>Observações: </td>
				<td><input type="text" size="20" id="obs" name="obs" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Enviar" /></td>
			</tr>
		</table>
	</form>
</body>
</html>