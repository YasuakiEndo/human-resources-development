package jp.co.brainnet.skillcheck.b;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/question7")
public class Question7 extends HttpServlet {

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    // リクエストの文字エンコーディング
    request.setCharacterEncoding("UTF-8");

    // フォーム情報の取得
    String str = request.getParameter("userName");

    // HTTPヘッダに出力形式を指定
    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out = response.getWriter();

    // HTTP本文へHTML文字列の出力
    out.println("<HTML><HEAD><TITLE>練習問題７</TITLE></HEAD>");
    out.println("<BODY>");
    out.println("ユーザ名：" + str + "<BR>");
    out.println("</BODY></HTML>");
    out.close();
  }
}
