package org.apache.jsp.ex15;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Time_005fattack_005fresult_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      ex12.Time member_2 = null;
      synchronized (session) {
        member_2 = (ex12.Time) _jspx_page_context.getAttribute("member_2", PageContext.SESSION_SCOPE);
        if (member_2 == null){
          member_2 = new ex12.Time();
          _jspx_page_context.setAttribute("member_2", member_2, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    request.setCharacterEncoding("UTF-8");
    String time = request.getParameter("time");
   String member_id = session.getAttribute("member_id").toString();
    member_2.time_update(member_id,time);
   member_2.time_rireki(member_id,time);



      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>タイムアタックモード 結果</title>       \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style_1.css\" media=\"all\" />\n");
      out.write("        <style>\n");
      out.write("            table{\n");
      out.write("  border-collapse:separate;\n");
      out.write("  border-spacing: 5px;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("  h1 {\n");
      out.write("                color: #6594e0;/*文字色*/\n");
      out.write("                border-bottom: dashed 2px #6594e0;\n");
      out.write("                /*線の種類（点線）2px 線色*/\n");
      out.write("            }\n");
      out.write("\n");
      out.write("table th,table td{\n");
      out.write("  border-radius: 5px;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 10px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table th{\n");
      out.write("  background-color: #6594e0;\n");
      out.write("  color: white;\n");
      out.write("  border:solid 1px #927141;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table td{\n");
      out.write("  background-color:  #87cefa;\n");
      out.write("  border:solid 1px #af9d85;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1><center>結果</center></h1>\n");
      out.write("        <div id=\"form\">\n");
      out.write("            <p class=\"form-title\">TIME</p>\n");
      out.write("\n");
      out.write("            <h2><center>TIME:");
      out.print(time);
      out.write("秒</center></h2>\n");
      out.write("            <article><center>\n");
      out.write("                    <h2>TOP3</h2>\n");
      out.write("            <table >\n");
      out.write("                <tr><th>順位</th><th>ユーザーID</th><th>TIME</th></tr>\n");
      out.write("                        ");
 for (int i = 0; i < member_2.getNum(); i++) {
      out.write("\n");
      out.write("                <tr><td>");
      out.print(i+1);
      out.write("</td><td>");
      out.print( member_2.getMember(i));
      out.write("</td>><td>");
      out.print( member_2.getTime(i));
      out.write("秒</td></tr>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("            </table>\n");
      out.write("            </center>\n");
      out.write("        </article>\n");
      out.write("            <center>\n");
      out.write("                <div class=\"form_conf\">\n");
      out.write("                    <form name=\"Start\" action=\"Time_attack_rule.jsp\" method=\"post\">\n");
      out.write("                        <p class=\"submit\"><input type=\"submit\" value=\"もう一回やる\">\n");
      out.write("                    </form>\n");
      out.write("                    <form name=\"Start\" action=\"Member_home.jsp\" method=\"post\">\n");
      out.write("                        <p class=\"submit\"> <input type=\"submit\" value=\"会員HOME\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </center>\n");
      out.write("\n");
      out.write("\n");
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
