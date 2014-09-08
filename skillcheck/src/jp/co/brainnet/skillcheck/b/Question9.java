package jp.co.brainnet.skillcheck.b;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/question9")
public class Question9 extends HttpServlet {

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    HttpSession session = request.getSession();

    // パスワードの照合
    String formName     = request.getParameter("userName");
    String formPassword = request.getParameter("password");
    if (formName != null && formPassword != null && formName.equals("java") && formPassword.equals("test")) {
      session.setAttribute("isLogin", "true");
      ServletContext sc = this.getServletContext();
      RequestDispatcher rd = sc.getRequestDispatcher("/question9.jsp");
      rd.forward(request, response);
    } else {
      response.sendRedirect("question9.html");
    }
  }
}
