package jp.co.brainnet.skillcheck.b;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/question10")
public class Question10 extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    processRequest(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    processRequest(req, resp);
  }

  private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    resp.setContentType("text/html;charset=UTF-8");
    PrintWriter out = resp.getWriter();

    out.println("<HTML><HEAD>");
    out.print("<TITLE>サーブレット:九九</TITLE>");
    out.print("</HEAD>");
    out.print("<BODY>");
    out.print("<h1>サーブレット:九九のプログラム</h1>");
    out.println("<TABLE border=1>");

    for (int i = 1; i <= 9; i++) {
      out.println("<TR>");
      for (int j = 1; j <= 9; j++) {
        int k = i * j;
        out.println("<TD>" + i + "×" + j + "=" + (k < 10 ? ("&nbsp;" + k) : k) + "</TD>");
      }
      out.println("</TR>");
    }

    out.println("</TABLE>");
    out.print("</BODY></HTML>");

    out.close();
  }

}
