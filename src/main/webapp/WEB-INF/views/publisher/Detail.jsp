<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<h2>출판사 상세</h2>

<h3>findById</h3>
<form action="${contextPath}/publishers/detail/id" method="post">
  

  <div class="container">
    <label for="pubId"><b>custId</b></label>
    <input type="text" placeholder="Enter ID" name="pubId" required>

    <button type="submit">Join</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
    
    
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>

<h3>findByPubName</h3>
<form action="${contextPath}/publisher/detail/name" method="post">
  

  <div class="container">
    <label for="pubName"><b>custId</b></label>
    <input type="text" placeholder="Enter name" name="pubName" required>

    <button type="submit">Join</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
    
    
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>

</body>
</html>