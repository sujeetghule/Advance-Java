<%@page import="com.jspiders.contact_manager_servlet.JDBC.ContactJDBC"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.jspiders.contact_manager_servlet.entity.Contact"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<style>
.bright {
	color: white;
}
.foot {
	position: fixed;
	bottom: 0;
}
.box {
	background: rgb(16, 136, 80);
	background: linear-gradient(45deg, rgba(16, 136, 80, 0.5914740896358543)
		36%, rgba(37, 195, 227, 0.5802696078431373) 100%);
	width: 80%;
}

.bg-head {
	background: rgb(16, 136, 80);
	background: linear-gradient(45deg, rgba(16, 136, 80, 1) 36%,
		rgba(37, 195, 227, 1) 100%);
}
</style>
<body>

	<nav class="navbar navbar-dark bg-head">
		<div class="container">
		<span class="mb-0 p-3 h1 bright">CONTACT MANAGER</span>
		<a href="./add_contact.html" class="btn btn-warning">Insert 2 Contact</a>
		<a href="./search.html" class="btn btn-warning">Search Contact</a>
		<a href="#" class="btn btn-warning">Update Data</a>
		<a href="./contact" class="btn btn-warning">View All Contact</a>
		<a href="./deleted" class="btn btn-danger">Delete Data</a>
		
		</div>
	</nav>

	<div class="container box rounded rounded-5 my-2 p-3">
		<div class="row row-cols-1 row-cols-md-4">
			<%
			List<Contact> contacts = (List<Contact>) request.getAttribute("list");
			for (Contact contact : contacts) {
			%>
			<div class="col my-2 d-flex justify-content-around">
				<div class="card m-1" style="width: 18rem">
					<div class="card-body">
						<h5 class="card-title"><%=contact.getF_name()%>
							<%=contact.getL_name()%></h5>
						<p class="card-text">
							Email :
							<%=contact.getEmail()%></p>
						<p class="card-text">
							Mobile :
							<%=contact.getMobile()%></p>
						<p class="card-text">
							DOB :
							<%=contact.getDob()%></p>
						<p class="card-text">
							Category :
							<%=contact.getCategory()%></p>
						<button class="btn btn-warning" onclick="Delete(<%contact.getEmail();%>)">Delete 2</button>
					</div>
				</div>
			</div>
			<%
			}
			%>
	</div>



	</div>
	<div class="container-fluid foot p-3 bg-secondary">
		<p class="text-center bright">&copy; 2024 . All rights reserved
			for Jspiders.com.</p>
	</div>
	<script>
  function Delete(email) {
   alert("Contact deleted");
   
  }
  
  
</script>
</body>
</html>