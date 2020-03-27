package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ListApprove_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>List Approve</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"mainlayout\" align=\"center\">\n");
      out.write("            <div id=\"container\" style=\"width: 800px\">\n");
      out.write("                <div id=\"header\"><h2>MINI LIBRARY SYSTEM</h2></div>\n");
      out.write("                <div id=\"content\">\n");
      out.write("                    ");

                        String matric = (String) request.getAttribute("txtmatric");
                        String bookid = (String) request.getAttribute("txtbookid");

                        Class.forName("com.mysql.jdbc.Driver");
                        String urls = "jdbc:mysql://localhost:3306/mini_library_system";
                        Connection conn = DriverManager.getConnection(urls, "root", "admin");
                        Statement st = conn.createStatement();
                        String sql = "select * from listborrower";
                        ResultSet rs2 = st.executeQuery(sql);

                    
      out.write("\n");
      out.write("                    <table class=\"table table-striped\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Matric No </th>\n");
      out.write("                            <th>Book ID</th>\n");
      out.write("                            <th>Status </th>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        ");
                            while (rs2.next()) {
                                out.println("<tr>");
                                out.println("<td>" + rs2.getString(1) + "</td>");
                                out.println("<td>" + rs2.getInt(2) + "</td>");
                                out.println("<td>" + rs2.getString(3) + "</td>");
                                out.println("</td>");
                                out.println("</tr>");
                            }
                        
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                    ");

                        conn.close();
                    
      out.write("\n");
      out.write("                    <a href=\"StudentPage.jsp\" class=\"button btn\" role=\"button\">HomePage</a>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"footer\" >\n");
      out.write("                    <b>&COPY;minilibrary</b>\n");
      out.write("                </div>\n");
      out.write("            </div>     \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
