package jp.co.brainnet.skillcheck.b;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/question6")
public class Question6 extends HttpServlet {

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    // HTTPヘッダに出力形式を指定
//     response.setContentType("text/html");
    response.setContentType("text/html;charset=UTF-8");

    // 出力ストリームの取得
    PrintWriter out = response.getWriter();
    // ServletOutputStream out = response.getOutputStream();

    // HTTP本文へHTML文字列の出力
    out.println("<HTML><HEAD><TITLE>練習問題６</TITLE></HEAD>");
    out.println("<BODY><H1>Hello World !</H1>");
    out.println("<BODY><H1>こんにちは、世界！</H1>");
    out.println("</BODY></HTML>");
    out.close();
  }
}
