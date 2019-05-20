package org.apache.jsp.ex15;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_005ferror_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      ex12.Login member = null;
      synchronized (session) {
        member = (ex12.Login) _jspx_page_context.getAttribute("member", PageContext.SESSION_SCOPE);
        if (member == null){
          member = new ex12.Login();
          _jspx_page_context.setAttribute("member", member, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');
 /* エンコード */
 /* リクエストの取得 */
    request.setCharacterEncoding("UTF-8");
    String member_id = request.getParameter("member_id");
    String password = request.getParameter("password");
    //セッションの取得
    session.setAttribute("member_id", member_id);
    session.setAttribute("password", password);

    int i = 0;
    //データベースにアクセスし、ログインを試みる
    i = member.login(request.getParameter("member_id"), request.getParameter("password"));
    System.out.println(i);
    if (i == 0 || member_id == "" || password == "") {//エラーが出たときの処理


      out.write("\n");
      out.write("<html lang=\"ja\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>ログイン</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style_1.css\" media=\"all\" />\n");
      out.write("            <style>\n");
      out.write("  h1 {\n");
      out.write("                color: #6594e0;/*文字色*/\n");
      out.write("                border-bottom: dashed 2px #6594e0;\n");
      out.write("                /*線の種類（点線）2px 線色*/\n");
      out.write("            }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1><center>神経衰弱</center></h1>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("        <div id=\"form\">\n");
      out.write("            <p class=\"form-title\">ログイン</p>\n");
      out.write("\n");
      out.write("            <center><p>ユーザーID</p>\n");
      out.write("                <form name=\"ログイン\" action=\"Login_error.jsp\" method=\"post\"> \n");
      out.write("                    <p class=\"name\"><input type=\"text\" name=\"member_id\" value=\"\" /></p>\n");
      out.write("                    <p>パスワード</p>\n");
      out.write("                    <p class=\"pass\"><input type=\"text\" name=\"password\" value=\"\" /></p></center>\n");
      out.write("            <p>※名前またはパスワードが入力されていないかパスワードが間違っています。</p>\n");
      out.write("            <div class=\"form_conf\">\n");
      out.write("                <p class=\"submit\"><input type=\"submit\" value=\"login\">   \n");
      out.write("                    </form>\n");
      out.write("                <form name=\"ログイン\" action=\"Account_mk.jsp\" method=\"post\">  \n");
      out.write("                    <p class=\"submit\"><input type=\"submit\" value=\"アカウント作成\"  >\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
} else {//ログインに成功したときの処理
    member.rireki(member_id);

      out.write('\n');
      if (true) {
        _jspx_page_context.forward("Member_home.jsp");
        return;
      }
      out.write('\n');

    }

      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
