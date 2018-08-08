<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="guestbook.service.DeleteMessageService" %>
<%@ page import="guestbook.service.InvalidPasswordException" %>

<%
  int messageId = Integer.parseInt(request.getParameter("messageId"));
  String password = request.getParameter("password");
  boolean invalidPassword = false;
  try {
    DeleteMessageService deleteSerivce = DeleteMessageService.getInstance();
    deleteSerivce.deleteMessage(messageId, password);
  } catch(InvalidPasswordException ex) {
    invalidPassword = true;
  }
%>
<html>
<head>
<title>방명록 메시지 삭제함</title>
</head>
<body>

<% if (!invalidPassword) { %>
 메시지를 삭제 하였습니다
 <% }else{ %>
 입력한 암호가 올바르지 않습니다
 암호를 확인해 주세요
 <% } %>
 <br/>
 <a href="list.jsp">[목록보기]</a>
</form>
</body>
</html>
