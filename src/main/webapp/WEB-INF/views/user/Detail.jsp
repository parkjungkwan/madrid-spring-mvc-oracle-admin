<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<body>

<h2>Customer Detail</h2>

<form action="<%= application.getContextPath() %>/customers/detail/custId" method="post">
  <div class="container">
    <label for="custId"><b>custId</b></label>
    <input type="text" placeholder="Enter ID" name="custId" required>
    <button type="submit">Detail</button>
  </div>
</form><hr/>

<a href="./customer/Detail">Detail</a>
<a href="./customer/Detail">List</a>
<a href="./customer/Detail">Login</a>
<a href="./customer/Detail">Register</a>
<a href="./customer/Detail">Update</a>
<a href="./customer/Detail">Delete</a>
</body>
</html>