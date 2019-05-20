package org.apache.jsp.ex15;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Time_005fattack_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    request.setCharacterEncoding("UTF-8");
    String name = request.getParameter("name");
    String pass = request.getParameter("pass");
    String login = request.getParameter("ログイン");
    String make_account = request.getParameter("アカウント作成");
    session.setAttribute("name", name);


      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"ja\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"style_1.css\" media=\"all\" />\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"robots\" content=\"noindex\">\n");
      out.write("\n");
      out.write("        <title>神経衰弱 タイムアタックモード</title>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"Time_attack.js\">\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            #panel {\n");
      out.write("                width: 500px;\n");
      out.write("                height: 600px;\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("            h1 {\n");
      out.write("                color: #6594e0;/*文字色*/\n");
      out.write("                border-bottom: dashed 2px #6594e0;\n");
      out.write("                /*線の種類（点線）2px 線色*/\n");
      out.write("            }\n");
      out.write("            .card {\n");
      out.write("                width: 90px;\n");
      out.write("                height: 135px;\n");
      out.write("                line-height: 135px;\n");
      out.write("                border: 1px solid silver;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 26px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                box-shadow: gray 2px 2px;\n");
      out.write("                background: white;\n");
      out.write("                float: left;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            .open{\n");
      out.write("                 pointer-events : none;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            /* 裏の状態 */\n");
      out.write("            .back {\n");
      out.write("                background-image: url('img/card.png');\n");
      out.write("                background-size: 90px 135px;\n");
      out.write("            }\n");
      out.write("            /* 終了時 */\n");
      out.write("            .finish {\n");
      out.write("                opacity: 0;\n");
      out.write("                cursor: default;\n");
      out.write("                pointer-events : none;\n");
      out.write("            }\n");
      out.write("            /* 経過秒数 */\n");
      out.write("            #result {\n");
      out.write("                  padding: 0.5em 1em;\n");
      out.write("    margin: 2em 0;\n");
      out.write("    background: #f0f7ff;\n");
      out.write("    border: dashed 2px #5b8bd0;/*点線*/\n");
      out.write("                font-size: 1.2em;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            #result p{\n");
      out.write("                   margin: 0; \n");
      out.write("    padding: 0;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>神経衰弱 タイムアタックモード</h1>\n");
      out.write("        <div id=\"panel\"></div>\n");
      out.write("\n");
      out.write("        <div id=\"result\"><p>経過秒数: </p></div></center>\n");
      out.write("\n");
      out.write("</body>\n");
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
