package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/mymenu2.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("          ");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"abc.css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
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
      out.write("          \n");
      out.write("          <div id=\"mydata\">\n");
      out.write("              <center> \n");
      out.write("<form action=\"update.jsp\">\n");
      out.write("    \n");
      out.write("    <table cellpadding=\"12\">\n");
      out.write("  \n");
      out.write("   \n");
      out.write("<tr>\n");
      out.write("<td>Enter RNO</td>\n");
      out.write("<td><input type=\"text\" placeholder=\"Search\" name=\"n11\" class=\"A\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<th colspan=\"2\"><input type=\"submit\" class=\"B\" name=\"b1\" value=\"Search\"></th>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("</form>\n");

    String s1=request.getParameter("b1");
    
    if(s1!=null){
        
          String s11=request.getParameter("n11");
     
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql:///abhidb?allowPublicKeyRetrieval=true&useSSL=false","root","root");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select *from insmarks where URNO='"+s11+"'");

if(rs.next())
{

      out.write("\n");
      out.write("    <table cellpadding=\"12\">\n");
      out.write("<tr>\n");
      out.write("<td>Roll</td>\n");
      out.write("<td><input type=\"text\" value=");
      out.print(rs.getString(1));
      out.write(" name=\"n1\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td>Name</td>\n");
      out.write("    <td><input type=\"text\" value=");
      out.print(rs.getString(2));
      out.write(" name=\"n2\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td>UPHY</td>\n");
      out.write("    <td><input type=\"text\" value=");
      out.print(rs.getString(3));
      out.write(" name=\"n3\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td>UCHE</td>\n");
      out.write("    <td><input type=\"text\" value=");
      out.print(rs.getString(4));
      out.write(" name=\"n4\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td>UMATHS</td>\n");
      out.write("    <td><input type=\"text\" value=");
      out.print(rs.getString(5));
      out.write(" name=\"n5\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<th colspan=\"2\"><input type=\"submit\" class=\"B\" name=\"b2\" value=\"Update\"></th>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("              ");

              
  }
else{
    out.println("Invalid Roll No.");
}

con.close();
}
catch(Exception e1)
{
out.println(e1);
}}

      out.write("\n");
      out.write("</center>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");

    String s2=request.getParameter("b2");
    if(s2!=null)
    {
    String s21 = request.getParameter("n1");
    String s22 = request.getParameter("n2");
    String s23 = request.getParameter("n3");
    String s24 = request.getParameter("n4");
    String s25 = request.getParameter("n5");
    
    try
    {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql:///abhidb?allowPublicKeyRetrieval=true&useSSL=false","root","root");
	Statement st = con.createStatement();
	st.executeUpdate("update insmarks set UNAME='"+s22+"',UPHY='"+s23+"',UCHE='"+s24+"',UMATHS='"+s25+"' where URNO='"+s21+"'");
           
        response.sendRedirect("showall.jsp");
  	con.close();
		}
		catch(Exception e1)
		{
			out.println(e1);
		}

    }
    else
    {
        out.println("Error");
    }
    
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
