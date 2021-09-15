<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<body>

<h2>Customer Register</h2>

<form action="<%= application.getContextPath() %>/customers/register" method="post">
  

  <div class="container">
    <label for="custId"><b>custId</b></label>
    <input type="text" placeholder="Enter ID" name="custId" required>
    
  
    <label for="custName"><b>name</b></label>
    <input type="text" placeholder="Enter name" name="custName" required>

    <label for="address"><b>address</b></label>
    <input type="text" placeholder="Enter address" name="address" >
        <label for="phone"><b>phone</b></label>
    <input type="text" placeholder="Enter phone" name="phone" required>
    <button type="submit">Register</button>     
  </div>
</form>

</body>
</html>