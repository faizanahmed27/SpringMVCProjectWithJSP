<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./css.jsp"%>
</head>
<body>

	<div class="container mt-3">

		<div class="row">

			<div class="col-md-6 offset-md-3">

				<h1 class="text-center mb-3">Update the User Details</h1>

				<form action="${pageContext.request.contextPath}/save-user" method="post">
				
				<!-- ID field -->
				
				<label>ID</label>
				
				<input type="text" value="${user.id}" name="id" />

					<!-- User First Name label and field -->
					<div class="form-group">
						<label for="name">First Name</label> <input type="text"
							class="form-control" id="first_name" aria-describedly="emailHelp"
							name="first_name" placeholder="Enter the User First Name here"
							value="${user.first_name}">
					</div>

					<!-- User Last Name label and field-->

					<div class="form-group">

						<label for="last_name">Last Name</label> <input type="text"
							class="form-control" id="last_name" name="last_name"
							placeholder="Enter the User Last Name here"
							value="${user.last_name}">

					</div>

					<!-- User E-mail and field -->

					<div class="form-group">
						<label for="mail">E-mail</label> <input type="text"
							placeholder="Enter User E-mail" name="mail" class="form-control"
							id="mail" value="${user.mail}">

					</div>

					<!-- User Password and field -->

					<div class="form-group">
						<label for="password">Password</label> <input type="password"
							placeholder="Enter User Password" name="password"
							class="form-control" id="password" value="${user.password}">

					</div>

					<!-- User Confirm Password and field -->

					<div class="form-group">
						<label for="confirm_password">Confirm Password</label> <input
							type="password" placeholder="Enter User Confirm Password"
							name="confirm_password" class="form-control"
							id="confirm_password" value="${user.confirm_password}">

					</div>

					<!-- User Contact Number and field -->

					<div class="form-group">
						<label for="mob">Contact Number</label> <input type="text"
							placeholder="Enter User Contact Number" name="mob"
							class="form-control" id="mob" value="${user.mob}">

					</div>

					<div class="container text-center">
						<a href="${pageContext.request.contextPath }/"
							class="btn btn-outline-danger">Back</a>
						<button type="submit" class="btn btn-primary">Edit</button>

					</div>

				</form>

			</div>

		</div>

	</div>

</body>
</html>