<%@ include file="/WEB-INF/views/include.jsp"%>

<html>
<head>
<title><fmt:message key="title" /></title>
</head>
<body>
	<h1>
		<fmt:message key="heading" />
	</h1>
	<p>
		<fmt:message key="greeting" />
		<c:out value="${model.now}" />
	</p>
	<h2>Data</h2>
	<table border="5">
		<caption><strong>Products</strong></caption>
		<thead>
			<th>Id</th>
			<th>Name</th>
			<th>Amount</th>
			<th>Price</th>
			<th>Id Provider</th>
			<th>Id Store</th>
		</thead>
		<tbody>
			<c:forEach items="${model.products}" var="prod">
                <tr>  
					<td><c:out value="${prod.id}" /></td>
					<td><c:out value="${prod.name}" /></td>
					<td><c:out value="${prod.amount}" /></td>
					<td><c:out value="${prod.price}" /></td>
					<td><c:out value="${prod.provider.id}" /></td>
					<td><c:out value="${prod.store.id}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br />
	<table border="5">
		<caption><strong>Providers</strong></caption>
		<thead>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Address</th>
			<th>Phone</th>
		</thead>
		<tbody>
			<c:forEach items="${model.providers}" var="prov">
                <tr>  
					<td><c:out value="${prov.id}" /></td>
					<td><c:out value="${prov.name}" /></td>
					<td><c:out value="${prov.email}" /></td>
					<td><c:out value="${prov.address}" /></td>
					<td><c:out value="${prov.phone}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br />
	<table border="5">
		<caption><strong>Stores</strong></caption>
		<thead>
			<th>Id</th>
			<th>Address</th>
		</thead>
		<tbody>
			<c:forEach items="${model.stores}" var="store">
                <tr>  
					<td><c:out value="${store.id}" /></td>
					<td><c:out value="${store.address}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br />
	<h2>Functions</h2>
	<ul>
		<li>Products
			<ul>
				<li><a href="<c:url value="addproduct.htm"/>">Add or Update Product</a></li>
				<li><a href="<c:url value="deleteproduct.htm"/>">Delete Product</a></li>
			</ul>
		</li>
		<li>Providers
			<ul>
				<li><a href="<c:url value="addprovider.htm"/>">Add or Update Provider</a></li>
				<li><a href="<c:url value="deleteprovider.htm"/>">Delete Provider</a></li>
			</ul>
		</li>
		<li>Stores
			<ul>
				<li><a href="<c:url value="addstore.htm"/>">Add or Update Store</a></li>
				<li><a href="<c:url value="deletestore.htm"/>">Delete Store</a></li>
			</ul>
		</li>		
	</ul>
</body>
</html>