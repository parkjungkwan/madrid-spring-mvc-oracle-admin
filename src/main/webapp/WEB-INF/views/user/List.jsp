<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<body>

<h2>Customer List</h2>

<form action="<%= application.getContextPath() %>/customers/list" method="post">
  <div class="container">
    <button type="submit">All List</button>
 </div>
</form>
<form action="<%= application.getContextPath() %>/customers/list/custName" method="post">
  <div class="container">
    <label for="custName"><b>custName</b></label>
    <input type="text" placeholder="Enter custName" name="custName" required>
    <button type="submit">Detail</button>
  </div>
</form><hr/>
<form action="<%= application.getContextPath() %>/customers/list/address" method="post">
  <div class="container">
    <label for="address"><b>address</b></label>
    <input type="text" placeholder="Enter address" name="address" required>
    <button type="submit">Detail</button>
  </div>
</form><hr/>
<form action="<%= application.getContextPath() %>/customers/list/phone" method="post">
  <div class="container">
    <label for="phone"><b>phone</b></label>
    <input type="text" placeholder="Enter ID" name="phone" required>
    <button type="submit">Detail</button>
  </div>
</form><hr/>

</body>
</html>