<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
  request.setCharacterEncoding("UTF-8");
  String isLogin = (String) session.getAttribute("isLogin");
  if (isLogin == null || !isLogin.equals("true")) {
    pageContext.forward("./question9.html");
  }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>練習問題9（認証後の画面）</title>
</head>
<body>
ログイン成功です。
</body>
</html>
