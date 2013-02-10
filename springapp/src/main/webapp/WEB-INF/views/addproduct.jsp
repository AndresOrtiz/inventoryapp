<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
  <title><fmt:message key="title"/></title>
  <style>
    .error { color: red; }
  </style>  
</head>
<body>
<h1><fmt:message key="addproduct.heading"/></h1>
<form:form method="post" commandName="product">
  <table width="95%" bgcolor="f8f8ff" border="0" cellspacing="0" cellpadding="5">
  	<tr>
      <td align="right" width="40%">Id :</td>
      <td width="60%">
        <form:input path="id" />
      </td>
    </tr>
    <tr>
      <td align="right" width="40%">Name :</td>
      <td width="60%">
        <form:input path="name" />
      </td>
    </tr>
    <tr>
      <td align="right" width="40%">Price :</td>
      <td width="60%">
        <form:input path="price" />
      </td>
    </tr>
    <tr>
      <td align="right" width="40%">Amount :</td>
      <td width="60%">
        <form:input path="amount" />
      </td>
    </tr>
    <tr>
      <td align="right" width="40%">Provider Id :</td>
      <td width="60%">
        <form:input path="provider.id" />
      </td>
    </tr>
    <tr>
      <td align="right" width="40%">Store Id :</td>
      <td width="60%">
        <form:input path="store.id" />
      </td>
    </tr>
  </table>
  <br>
  <input type="submit" align="center" value="Save">
</form:form>
<a href="<c:url value="hello.htm"/>">Home</a>
</body>
</html>