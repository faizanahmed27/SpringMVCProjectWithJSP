<html>
<head>
<%@include file="./css.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>

<body>

	<div class="container mt-3">

		<div class="row">

			<div class="col-md-12">

				<h1 class="text-center mb-3">User List!</h1>

				<table class="table table-striped">
					<thead>
						<tr>
							<th scope="col">Sr.No.</th>
							<th scope="col">First Name</th>
							<th scope="col">Last Name</th>
							<th scope="col">E-mail</th>
							<th scope="col">Password</th>
							<th scope="col">Confirm Password</th>
							<th scope="col">Contact Number</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
					
					<c:forEach items="${users }" var = "p">
						<tr>
							<th scope="row">${p.id }</th>
							<td>${p.first_name}</td>
							<td>${p.last_name}</td>
							<td>${p.mail}</td>
							<td>${p.password}</td>
							<td>${p.confirm_password}</td>
							<td>${p.mob}</td>
							<td>
							<a onclick = "confirmDelete()" href="delete-user/${p.id }"><i class="fas fa-trash text-danger" style="font-size: 30;"></i></a>
							<a href="update-user/${p.id }"><i class="fas fa-user-edit" style="font-size: 30;"></i></a>
							
							</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
				
<div class = "container text-center">

<a href = "add-user" class = "btn btn-outline-success">Add User</a>

</div>
			</div>


		</div>

	</div>
	
	<script>
	
	function confirmDelete(){
		
		var x = confirm("Are you sure you waant to delete?");
		
		if(x==true)
			return true;
		
		else
			return false;
	}
	
	</script>

</body>
</html>
