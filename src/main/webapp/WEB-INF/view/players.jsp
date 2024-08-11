<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>

<html lang="en">
<head>
<meta charset="utf-8">
<title>home_page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">name</th>
				<th scope="col">number</th>
				<th scope="col">address</th>
				<th scope="col">phone</th>
				<th scope="col">service</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach var="player" items="${kolplayers}">
				<tr>
					<td>${player.id}</td>
					<td>${player.name}</td>
					<td>${player.number}</td>
					<td>${player.address}</td>
					<td>${player.phone}</td>
					<td>
					<c:url  var="editplayer" value="/getonePlayer">
					<c:param name="playid" value="${player.id}"></c:param>
					</c:url>
						<a href="${editplayer}" type="button" class="btn btn-primary">edit</a>
						
					<c:url  var="deleteplayer" value="/deleteonePlayer">
					<c:param name="playid" value="${player.id}"></c:param>
					</c:url>

						<a href="${deleteplayer}"  type="button" class="btn btn-danger">delete</a>

					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a class="btn btn-primary" href="addPlayer" role="button">addPlayer</a>

</body>
</html>
