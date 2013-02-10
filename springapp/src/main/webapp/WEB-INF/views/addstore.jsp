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
<h1><fmt:message key="addstore.heading"/></h1>
<form:form method="post" commandName="store">
  <table width="95%" bgcolor="f8f8ff" border="0" cellspacing="0" cellpadding="5">
    <tr>
      <td align="right" width="40%">Id :</td>
      <td width="60%">
        <form:input path="id" />
      </td>
    </tr>
    <tr>
      <td align="right" width="40%">Address :</td>
      <td width="60%">
        <form:input path="address" />
      </td>
    </tr>    
  </table>
  <br>
  <input type="submit" align="center" value="Save">
</form:form>
<a href="<c:url value="hello.htm"/>">Home</a>
</body>
</html>