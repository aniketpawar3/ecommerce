<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List" import="com.zensar.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Place Order</title>
</head>
<body>


	<div class="container-fluid">
		<div class="row mt-5">

			<div class="col-sm">
				<%
					List<Products> listofproduct = (List<Products>) request.getAttribute("listofproduct");
				%>

				<%
					float total = 0;
				%>>


				<%
					for (Products product : listofproduct) {
				%>
				<h2>Your Selected items</h2>
					<h1><%=product.getP_name()%></h1>
					<p><%=product.getP_discountprice()%></p>
					<p><%=product.getP_fulldescription()%></p>
			
				<%
					total += product.getP_discountprice();
				%>
				<p>

					<%
						}
					%>
				
				<p>==================================</p>
				<h2>
					Total = Rs.
					<%=total%></h2>
				<h3>Shipping charges = Rs. 99</h3>
				<h2>
					Grand Total = Rs.
					<%=total + 99%></h2>

			</div>
			<div class="col-sm">
				<h2>Your Details</h2>

				<form>
					<div class="form-group">
						<label for="exampleInputEmail1">Email address</label> <input
							type="email" class="form-control" id="exampleInputEmail1"
							aria-describedby="emailHelp" placeholder="Enter email"> <small
							id="emailHelp" class="form-text text-muted">We'll never
							share your email with anyone else.</small>
					</div>
				</form>
			</div>

		</div>

	</div>
</body>
</html>