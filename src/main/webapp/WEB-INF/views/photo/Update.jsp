<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<body>

<h2>사진 수정</h2>

<form action="<%= request.getContextPath() %>/photos/update" method="post">
  

  <div class="container">
    <label for="photoId"><b>photoId</b></label>
    <input type="text" placeholder="Enter ID" name="photoId" required>
    
    <label for="albumId"><b>albumId</b></label>
    <input type="text" placeholder="albumId" name="albumId" required>

    <label for="locationId"><b>locationId</b></label>
    <input type="text" placeholder="locationId" name="locationId" >
    
    <label for="memberId"><b>memberId</b></label>
    <input type="text" placeholder="memberId" name="memberId" required>
    
    <label for="photoView"><b>photoView</b></label>
    <input type="text" placeholder="photoView" name="photoView" required>

    <label for="title"><b>title</b></label>
    <input type="text" placeholder="title" name="title" >
    
    <label for="photoDescription"><b>photoDescription</b></label>
    <input type="text" placeholder="photoDescription" name="photoDescription" required>
    
    <label for="privacy"><b>privacy</b></label>
    <input type="text" placeholder="privacy" name="privacy" required>

    <label for="uploadDate"><b>uploadDate</b></label>
    <input type="date" placeholder="uploadDate" name="uploadDate" >
    
    <label for="imagePath"><b>imagePath</b></label>
    <input type="text" placeholder="imagePath" name="imagePath" >
    
    
    <button type="submit">수정하기</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

</form>

<h2>사진 삭제</h2>

<form action="<%= request.getContextPath() %>/photos/delete">
  

  <div class="container">
    <label for="photoId"><b>photoId</b></label>
    <input type="text" placeholder="Enter ID" name="photoId" required>
    
    
    <button type="submit">삭제하기</button>
  </div>

</form>


</body>
</html>