<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>Add New Player</title>
</head>
<body>
	<h2>Add New Player</h2>
	<form:form action="savePlayer" method="post" modelAttribute="player">
		<table>


			<td><form:hidden path="id" /></td>

			<tr>
				<td>Name:</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Number:</td>
				<td><form:input path="number" /></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><form:input path="phone" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add Player" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
