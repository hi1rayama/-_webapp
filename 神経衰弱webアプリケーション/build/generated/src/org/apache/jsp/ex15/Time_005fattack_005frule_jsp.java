package org.apache.jsp.ex15;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Time_005fattack_005frule_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>タイムアタックモード　ルール説明</title>       \n");
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
      out.write("        <h1><center>神経衰弱〜タイムアタックモード〜</center></h1>\n");
      out.write("        <div id=\"form\">\n");
      out.write("            <h2 class=\"form-title\">ルール説明</h2>\n");
      out.write("\n");
      out.write("            <form name=\"Start\" action=\"Time_attack.jsp\" method=\"post\">  \n");
      out.write("                <ol>\n");
      out.write("                    <li>このモードは、10ペアでゲームをプレイします。</li>\n");
      out.write("                    <li>裏向きになって散りばめられた20枚から2枚めくり、同じ数字のカードを揃えるゲームです。</li>\n");
      out.write("                    <li>出来るだけ早くカードを揃えてください</li>\n");
      out.write("                </ol>\n");
      out.write("                <center>\n");
      out.write("                    <p class=\"submit\"><input type=\"submit\" value=\"ゲームスタート\">\n");
      out.write("\n");
      out.write("                        <input type=\"button\" onclick=\"history.back()\" value=\"戻る\">\n");
      out.write("                </center>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write(" ");
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
