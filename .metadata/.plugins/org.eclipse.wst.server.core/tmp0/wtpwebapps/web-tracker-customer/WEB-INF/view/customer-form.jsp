<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Customer</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
<div id="wrapper" class="container">
   <div id="header" class="bg-dark">
      <h2>CRM - Customer Relationship Manager</h2>
   </div>
   <div id="container">
     <div id="form" class="table table-striped table-hover">
     <form:form action="saveCustomer" modelAttribute="customer" method="post">
     <form:hidden path="id"/>
     
     <table>
     <tr>
        <th><label>First Name:</label></th>
        <th><form:input path="firstName" class="form-control"/><th>
     </tr>
      <tr class="form-group">
        <th><label>Last Name:</label></th>
        <th><form:input path="lastName" class="form-control"/><th>
     </tr>
      <tr class="form-group">
        <th><label>Email:</label></th>
        <th><form:input path="email" class="form-control"/><th>
     </tr>
     <tr class="form-group">
        <th><label></label></th>
        <th><input type="submit" value="Save" class="btn btn-success"><th>
     </tr>
     </table>
     </form:form>
     <p>
     </p>
     <a href="${pageContext.request.contextPath}/customer/list"><button class="btn btn-secondary">Go Back</button></a>
     </div>
     </div>
     </div>
</body>
</html>