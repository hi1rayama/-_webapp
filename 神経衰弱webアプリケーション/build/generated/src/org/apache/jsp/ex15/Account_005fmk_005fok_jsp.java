package org.apache.jsp.ex15;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Account_005fmk_005fok_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    /* セッション内容の取得 */
    String member_id = "";
    String password = "";
    if (session.getAttribute("member_id") !="") {
        member_id = session.getAttribute("member_id").toString();
    }
    if (session.getAttribute("password") != "") {
        password = session.getAttribute("password").toString();
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"ja\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>登録完了</title>\n");
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
      out.write("        <h1><center>登録完了</center></h1>\n");
      out.write("\n");
      out.write("        <div id=\"form\">\n");
      out.write("            <p class=\"form-title\">登録内容</p>\n");
      out.write("            <form name=\"アカウント作成\" action=\"Member_home.jsp\" method=\"post\">  \n");
      out.write("                <center> <p>ユーザーID</p>\n");
      out.write("                    <p class=\"name\">");
      out.print(member_id);
      out.write("</p>\n");
      out.write("                    <p>パスワード</p>\n");
      out.write("                    <p class=\"pass\">");
      out.print(password);
      out.write("</p>\n");
      out.write("                    <p class=\"submit\"><input type=\"submit\"  value=\"会員HOME\"></center>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
