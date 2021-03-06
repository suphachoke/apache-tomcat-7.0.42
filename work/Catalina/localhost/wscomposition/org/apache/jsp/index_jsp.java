/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.42
 * Generated at: 2015-12-29 06:48:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.Properties;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Web Services Search Engine</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"js/libs/bootstrap-3.2.0-dist/css/bootstrap.min.css\"/>\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            .jumbotron{margin-top:50px;}\r\n");
      out.write("            .navbar{background-color:white;}\r\n");
      out.write("            .radio-label{margin-right: 10px;}\r\n");
      out.write("            .textbox{width:100%;}\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    ");

        Properties prop = new Properties();
        prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
        String selectNS = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://" + prop.getProperty("db_host") + ":" + prop.getProperty("db_port") + "/" + prop.getProperty("db_name"), prop.getProperty("db_user"), prop.getProperty("db_pass"));
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery("select uri,description from namespace order by uri");
            while (res.next()) {
                String sel = (res.getString("uri").equals(request.getParameter("ontons"))) ? "selected" : "";
                selectNS += "<option name='ontons' value='" + res.getString("uri") + "' " + sel + " id='" + res.getString("description") + "'>" + res.getString("uri") + "</option>";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"navbar navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <div class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                        <span class=\"icon-bar\" style=\"background-color:black;\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\" style=\"background-color:black;\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\" style=\"background-color:black;\"></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">WS Search Engine</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <li class=\"active\"><a href=\"#\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"#\">About</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Contact</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"jumbotron\">\r\n");
      out.write("                <form id=\"wscform\" name=\"wscform\" method=\"post\" action=\"execWSC.jsp\">\r\n");
      out.write("                    <h2>Finding Compositions of Web Services</h2>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-5\">\r\n");
      out.write("                            <div class=\"panel panel-default\">\r\n");
      out.write("                                <div class=\"panel-heading\">\r\n");
      out.write("                                    <h3 class=\"panel-title\">Input</h3>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"panel-body\">\r\n");
      out.write("                                    <input class=\"textbox\" type=\"text\" name=\"input\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:void(0);\" class=\"glyphicon glyphicon-plus\" onclick=\"addTextbox(this.parentNode,'input');\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:void(0);\" class=\"glyphicon glyphicon-minus\" onclick=\"remTextbox(this.parentNode);\"></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-5\">\r\n");
      out.write("                            <div class=\"panel panel-default\">\r\n");
      out.write("                                <div class=\"panel-heading\">\r\n");
      out.write("                                    <h3 class=\"panel-title\">Output</h3>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"panel-body\">\r\n");
      out.write("                                    <input class=\"textbox\" type=\"text\" name=\"output\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:void(0);\" class=\"glyphicon glyphicon-plus\" onclick=\"addTextbox(this.parentNode,'output');\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:void(0);\" class=\"glyphicon glyphicon-minus\" onclick=\"remTextbox(this.parentNode);\"></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-10\">\r\n");
      out.write("                            <div class=\"panel panel-default\">\r\n");
      out.write("                                <div class=\"panel-heading\">\r\n");
      out.write("                                    <h3 class=\"panel-title\">Choose A Method</h3>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"panel-body\">\r\n");
      out.write("                                    <!--<input type=\"radio\" name=\"method\" value=\"link\"/>\r\n");
      out.write("                                    <span class=\"radio-label\">Link-index</span>-->\r\n");
      out.write("                                    <input type=\"radio\" name=\"method\" value=\"graph\" checked/>\r\n");
      out.write("                                    <span class=\"radio-label\">BFS (Breadth First Search)</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-10\">\r\n");
      out.write("                            <div class=\"panel panel-default\">\r\n");
      out.write("                                <div class=\"panel-heading\">\r\n");
      out.write("                                    <h3 class=\"panel-title\">Choose Web Services Dataset</h3>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"panel-body\">\r\n");
      out.write("                                    <select name=\"ontons\" onchange=\"javascript:$('#DBLabel').html(this.options[this.selectedIndex].getAttribute('id'));\">\r\n");
      out.write("                                        <option value=\"none\" selected=\"\">--- Select Dataset ---</option>\r\n");
      out.write("                                        ");
      out.print(selectNS);
      out.write("\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                    <div id=\"DBLabel\" class=\"label-warning\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <a class=\"btn btn-lg btn-success\" href=\"javascript:void(0);\" role=\"button\" onclick=\"this.parentNode.submit();\">Submit</a>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/libs/jquery/jquery.js\"></script>\r\n");
      out.write("        <script src=\"js/libs/bootstrap-3.2.0-dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tfunction addTextbox(nd,nm){\r\n");
      out.write("\t\t\t\tvar cd = document.createElement(\"input\");\r\n");
      out.write("\t\t\t\tvar att1 = document.createAttribute(\"type\");\r\n");
      out.write("\t\t\t\tatt1.value = \"text\";\r\n");
      out.write("\t\t\t\tvar att2 = document.createAttribute(\"name\");\r\n");
      out.write("\t\t\t\tatt2.value = nm;\r\n");
      out.write("\t\t\t\tvar att3 = document.createAttribute(\"class\");\r\n");
      out.write("\t\t\t\tatt3.value = \"textbox\";\r\n");
      out.write("\t\t\t\tcd.setAttributeNode(att1);\r\n");
      out.write("\t\t\t\tcd.setAttributeNode(att2);\r\n");
      out.write("\t\t\t\tcd.setAttributeNode(att3);\r\n");
      out.write("\t\t\t\tvar lastnd = null;\r\n");
      out.write("\t\t\t\tfor(var i=0;i<nd.childNodes.length;i++){\r\n");
      out.write("\t\t\t\t\tif(nd.childNodes[i].nodeName.toLowerCase()==\"a\"){\r\n");
      out.write("\t\t\t\t\t\tlastnd = nd.childNodes[i];\r\n");
      out.write("\t\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(lastnd!=null){\r\n");
      out.write("\t\t\t\t\tnd.insertBefore(cd,lastnd);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction remTextbox(nd){\r\n");
      out.write("\t\t\t\tvar lastnd = null;\r\n");
      out.write("\t\t\t\tfor(var i=0;i<nd.childNodes.length;i++){\r\n");
      out.write("\t\t\t\t\tif(nd.childNodes[i].nodeName.toLowerCase()==\"input\"){\r\n");
      out.write("\t\t\t\t\t\tlastnd = nd.childNodes[i];\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(lastnd!=null){\r\n");
      out.write("\t\t\t\t\tnd.removeChild(lastnd);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
