package org.apache.jsp.ex15;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Party_005fresult_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      ex12.Sort s = null;
      synchronized (session) {
        s = (ex12.Sort) _jspx_page_context.getAttribute("s", PageContext.SESSION_SCOPE);
        if (s == null){
          s = new ex12.Sort();
          _jspx_page_context.setAttribute("s", s, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

request.setCharacterEncoding("UTF-8");
    String p = request.getParameter("p"); 
s.sort(p);



      out.write("\n");
      out.write("<style>table{\n");
      out.write("  border-collapse:separate;\n");
      out.write("  border-spacing: 5px;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("  h1 {\n");
      out.write("                color: #6594e0;/*文字色*/\n");
      out.write("                border-bottom: dashed 2px #6594e0;\n");
      out.write("                /*線の種類（点線）2px 線色*/\n");
      out.write("            }\n");
      out.write(" \n");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>パーティモード 結果</title>       \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style_1.css\" media=\"all\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1><center>結果</center></h1>\n");
      out.write("        <div id=\"form\">\n");
      out.write("            <h2 class=\"form-title\">順位</h2>\n");
      out.write("\n");
      out.write("         \n");
      out.write("                <center>\n");
      out.write("                <table>\n");
      out.write("                    <tr><th>順位</th><th>プレイヤー名</th><th>ペア数</th></tr>\n");
      out.write("                ");
 for (int i = 0; i < 4; i++) {
      out.write("\n");
      out.write("                    <tr><td>");
      out.print(i+1);
      out.write("位</td><td>プレイヤー");
      out.print(s.getPlayer(i));
      out.write("</td><td>");
      out.print( s.getRank(i));
      out.write("\n");
      out.write("                                                           </td></tr> ");
 }
      out.write("\n");
      out.write("                </table>\n");
      out.write("                 <div class=\"form_conf\">\n");
      out.write("   <form name=\"Start\" action=\"Party_set.jsp\" method=\"post\"> \n");
      out.write("\n");
      out.write("                    <p class=\"submit\"><input type=\"submit\" value=\"もう一度やる\">\n");
      out.write("   </form>\n");
      out.write("                <form action=\"Member_home.jsp\" method=\"post\">\n");
      out.write("                    <p class=\"submit\">  <input type=\"submit\"  value=\"会員HOME\"></p>\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("                 </div>\n");
      out.write("                </center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
