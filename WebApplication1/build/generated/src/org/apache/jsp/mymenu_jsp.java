package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class mymenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/mymenu2.jsp");
    _jspx_dependants.add("/regis1.jsp");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"abc.css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"abc.css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write('\n');

    String s1=request.getParameter("username");
    String s2=request.getParameter("password");
    
try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql:///abhidb?allowPublicKeyRetrieval=true&useSSL=false","root","root");
	Statement st=con.createStatement();
	
	st.executeUpdate("insert into login values('"+s1+"','"+s2+"')");
	response.sendRedirect("login.jsp");
        
	con.close();
}
catch(Exception e1)
{
out.println(e1);	
}

      out.write("\n");
      out.write("<div id=\"mymenu\">\n");
      out.write("<ul>\n");
      out.write("\n");
      out.write("<li>Home</li>\n");
      out.write("\n");
      out.write("<li><a href=\"insert.jsp\">Insert</a></li>\n");
      out.write("<li><a href=\"search1.jsp\">Search</a></li>\n");
      out.write("<li><a href=\"showall.jsp\">ShowAll</a></li>\n");
      out.write("<li><a href=\"delete.jsp\">Delete</a></li>\n");
      out.write("<li><a href=\"update.jsp\">Update</a></li>\n");
      out.write("<li>Logout</li>\n");
      out.write("<li>About</li>\n");
      out.write("<li>Contact</li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("    <div id=\"data\">\n");
      out.write("        <center>\n");
      out.write("            <form>\n");
      out.write("                <h1>Menu Page</h1>\n");
      out.write("            </form>\n");
      out.write("        </center>\n");
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
