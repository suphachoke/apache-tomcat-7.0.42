/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.42
 * Generated at: 2016-01-15 01:47:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n");
      out.write("<HTML xmlns:rdf=\"http://www.w3.org/rdf/\">\n");
      out.write("    <HEAD>\n");
      out.write("        <TITLE>Nongbuarawae Hospital - Healthcare Information Center</TITLE>\n");
      out.write("        <meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\"/>\n");
      out.write("        <META NAME=\"Generator\" CONTENT=\"EditPlus\"/>\n");
      out.write("        <META NAME=\"Author\" CONTENT=\"\"/>\n");
      out.write("        <META NAME=\"Keywords\" CONTENT=\"\"/>\n");
      out.write("        <META NAME=\"Description\" CONTENT=\"\"/>\n");
      out.write("        <link rel=\"icon\" href=\"images/Medical_Chart-64.png\" type=\"image/png\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css-style1.css\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"animation.css\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style-header.css\" type=\"text/css\"/>\n");
      out.write("        <style rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("            * {margin:0;padding:0;}\n");
      out.write("            .footnote {font:bold 9pt arial;}\n");
      out.write("            table {border-collapse:collapse;margin:20px;}\n");
      out.write("            td,th {border:1px solid gray;padding:5px;}\n");
      out.write("            th {background-color: lightgray;}\n");
      out.write("            img {vertical-align:middle;}\n");
      out.write("            .picture {width:100px;}\n");
      out.write("            .content_frame {border:1px dashed gray;border-radius:8pt;padding:10px;margin:20px;margin-bottom:0;}\n");
      out.write("            p {font:11pt arial;text-align:justify;}\n");
      out.write("            img {margin-left:5px;margin-right:5px;}\n");
      out.write("            .text_right {text-align:right;}\n");
      out.write("            .quicksearch {margin-top:10px;}\n");
      out.write("            .footer {margin-left:20px; margin-top:10px;}\n");
      out.write("            #content {border:none; margin:0;border-collapse: collapse;}\n");
      out.write("            #content td {border:none;vertical-align: top;padding:0;}\n");
      out.write("            #login {margin-right: 0;margin-left: 10px;}\n");
      out.write("            #login td{border:1px solid black;text-align: center;padding:5px;}\n");
      out.write("            #recommended td,#recommended th{padding:1px;border:1px solid black;font-size:9pt;}\n");
      out.write("            #control_panel {border:1px solid black;border-radius: 5pt;margin-left:10px; margin-top:20px; width:250px;overflow:auto;}\n");
      out.write("            #control_panel h6{border-bottom: 1px solid black;background-color:lightgray;padding:5px}\n");
      out.write("            #control_panel p {font-size:9pt;}\n");
      out.write("            #control_panel .button {text-align: center;width:64px;margin:5px;}\n");
      out.write("            #control_panel .button:hover {background-color:activeborder;}\n");
      out.write("            #control_panel .button p {font-size:8pt;text-align: center;}\n");
      out.write("            hr{clear:left;}\n");
      out.write("        </style>\n");
      out.write("    </HEAD>\n");
      out.write("\n");
      out.write("    <BODY>\n");
      out.write("        <div class=\"header menubar\">\n");
      out.write("            <div class=\"search_holder right\"><input class=\"short\" type=\"text\" placeholder=\"Search site\"/><input type=\"button\" class=\"button search\"/></div>\n");
      out.write("            <div class=\"headline left\">\n");
      out.write("                <h1 class=\"title\">Healthcare Information Center</h1>\n");
      out.write("                <h2 class=\"subtitle left right_radius\">Nongbuarawae Hospital</h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"menu left left_radius\" onclick=\"window.location.href = 'index.jsp';\">Home</div>\n");
      out.write("            ");
if (session.getAttribute("userclass") != null) {//show quick search panel
      out.write("\n");
      out.write("\t\t\t<div class=\"menu left right_radius\" onclick=\"window.location.href = 'semantic_search.jsp';\">Search & Analytics</div>\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("            <!--<div class=\"menu left right_radius\" onclick=\"window.location.href = 'analytics_main.jsp';\">Analytics</div>-->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"quicksearch\" style=\"height:25px;\">\n");
      out.write("            ");
if (session.getAttribute("userclass") != null || true) {//show quick search panel
      out.write("\n");
      out.write("            <form id=\"quicksearch\" name=\"quicksearch\" action=\"quick_search_submit.jsp\" method=\"post\">\n");
      out.write("                <b>Quick Search</b>  \n");
      out.write("                <select name=\"by\">\n");
      out.write("                    <option value=\"citizen_id\">รหัสประจำตัวประชาชน</option>\n");
      out.write("                    <!--<option value=\"patient_code\">HN</option>-->\n");
      out.write("                    <option value=\"given_name\">ชื่อผู้ป่วย</option>\n");
      out.write("                </select>\n");
      out.write("                <input type=\"text\" name=\"keyword\"/>\n");
      out.write("                <button type=\"submit\">Search</button>\n");
      out.write("            </form>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <table id=\"content\">\n");
      out.write("            <tr>\n");
      out.write("                <!--left panel-->\n");
      out.write("                <td>\n");
      out.write("                    ");
if (session.getAttribute("userclass") == null) {//show login panel if userclass equal null
      out.write("\n");
      out.write("                    <form action=\"login.jsp\" method=\"post\">\n");
      out.write("                        <table id=\"login\" class=\"left half\">\n");
      out.write("                            <tr><th>Username</th><td><input type=\"text\" class=\"medium\" name=\"username\"/></td></tr>\n");
      out.write("                            <tr><th>Password</th><td><input type=\"password\" class=\"medium\" name=\"password\"/></td></tr>\n");
      out.write("                            <tr><td colspan=\"2\"><button onclick=\"this.parentNode.parentNode.parentNode.parentNode.submit();\">Login</button></td></tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                    ");
} else {//show user's control panel
      out.write("\n");
      out.write("                    <div id=\"control_panel\">\n");
      out.write("                        <h6>Control Panel<p>");
      out.print(session.getAttribute("userfirstname"));
      out.write("</p></h6>\n");
      out.write("                        ");
if (session.getAttribute("userclass").equals("administrator")) {//check if user is admin or not;
      out.write("\n");
      out.write("                        <div class=\"button left\" onclick=\"window.location.href = 'manage_users.jsp';\">\n");
      out.write("                            <img src=\"images/add_users_plus_group-32.png\"/>\n");
      out.write("                            <p>Manage Users</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"button left\" onclick=\"window.location.href = 'data_retrieval.jsp';\">\n");
      out.write("                            <img src=\"images/data_configuration.png\"/>\n");
      out.write("                            <p>Data Retrieval</p>\n");
      out.write("                        </div>\n");
      out.write("                        <!--<div class=\"button left\" onclick=\"window.location.href = 'configuration/index.jsp';\">\n");
      out.write("                            <img src=\"https://cdn0.iconfinder.com/data/icons/huge-business-vector-icons/60/equipment-32.png\"/>\n");
      out.write("                            <p>SIDI Configuration</p>\n");
      out.write("                        </div>-->\n");
      out.write("                        <hr/>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                        <div class=\"button left\" onclick=\"window.location.href = 'analytic.jsp';\">\n");
      out.write("                            <img src=\"images/gnumeric.png\"/>\n");
      out.write("                            <p>Manage Reports</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"button left\" onclick=\"window.location.href = 'change_password.jsp';\">\n");
      out.write("                            <img src=\"images/key_keeper_password_lock-32.png\"/>\n");
      out.write("                            <p>Update Profile</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"button left\" onclick=\"window.location.href = 'logout.jsp';\">\n");
      out.write("                            <img src=\"images/Exit_delete_close_remove_door_logout_out.png\"/>\n");
      out.write("                            <p>Sign Out</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <!--right panel-->\n");
      out.write("                <td>\n");
      out.write("                    <div class=\"content_frame left\">\n");
      out.write("                        <img class=\"picture left\" src=\"images/stock-photo-782551-medical-records.jpg\"/>\n");
      out.write("                        <h3 class=\"title\">Online Patient Records</h3>\n");
      out.write("                        <p>ระบบสืบค้นข้อมูลประวัติ ของผู้ป่วยแบบออนไลน์ เป็นการลดการใช้เอกสาร (paper less)  ช่วยลดภาระและประหยัดเวลาในการค้นหาเอกสารประวัติผู้ป่วย เพื่อนำไปสู่กระบวนการวินิจฉัยและรักษาของแพทย์ได้อย่างมีประสิทธิภาพยิ่งขึ้น</p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"content_frame left text_right\">\n");
      out.write("                        <img class=\"picture right\" src=\"images/stock-illustration-18837028-seamless-backgrounds-communications-monochrome.jpg\"/>\n");
      out.write("                        <h3 class=\"title\">Healthcare Data Integration</h3>\n");
      out.write("                        <p>ระบบบูรณาการข้อมูลผู้ป่วย ถูกพัฒนาขึ้นสำหรับเชื่อมโยงข้อมูลด้วยเทคโนโลยีเว็บสื่อความหมาย (Linked Data with Semantic Web Technology) เพื่อให้สอดคล้องกับระบบข้อมูลประวัติผู้ป่วยออนไลน์ ข้อมูลประวัติการรักษาทั้งหมดของผู้ป่วยรายบุคคลจะถูกเชื่อมโยงถึงกันได้อย่างถูกต้อง ด้วยกระบวนการให้เหตุผลข้อมูล (Reasoning)โดยเครื่องมือประมวลผล (Engine) อย่างเป็นอัตโนมัติ</p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"footer left\">\n");
      out.write("                        <b>Sponsors: </b>\n");
      out.write("                        <a href=\"http://rgj.trf.or.th/\" target=\"_blank\" alt=\"โครงการปริญญาเอกกาญจนาภิเษก (คปก.)\" title=\"โครงการปริญญาเอกกาญจนาภิเษก (คปก.)\"><img src=\"images/logo-rgj.png\" width=\"50px;\"/></a>\n");
      out.write("                        <a href=\"http://www.trf.or.th/\" target=\"_blank\" alt=\"สำนักงานกองทุนสนับสนุนการวิจัย (สกว.)\" title=\"สำนักงานกองทุนสนับสนุนการวิจัย (สกว.)\"><img src=\"images/trflogo.jpg\" width=\"50px;\"/></a>\n");
      out.write("                        <a href=\"http://www.kku.ac.th/\" target=\"_blank\" alt=\"มหาวิทยาลัยขอนแก่น\" title=\"มหาวิทยาลัยขอนแก่น\"><img src=\"images/kku_logo.png\" width=\"50px;\"/></a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div id=\"recommended\" class=\"footer center right\">\n");
      out.write("                        <TABLE class=\"footnote\">\n");
      out.write("                            <TR>\n");
      out.write("                                <TH>Recommended For</TH>\n");
      out.write("                                <TH>IE</TH>\n");
      out.write("                                <TH>Firefox</TH>\n");
      out.write("                                <TH>Chrome</TH>\n");
      out.write("                                <TH>Safari</TH>\n");
      out.write("                                <TH>Opera</TH>\n");
      out.write("                            </TR>\n");
      out.write("                            <TR>\n");
      out.write("                                <TD><img src=\"images/html5css3.gif\" title=\"HTML5 & CSS3\" height=\"24\"/></TD>\n");
      out.write("                                <TD><img src=\"images/ie.png\" title=\"Internet Explorer version 9.0 or higher\" width=\"24\"/>&nbsp;9+</TD>\n");
      out.write("                                <TD><img src=\"images/firefox.png\" title=\"Firefox version 4 or higher\" width=\"24\"/>&nbsp;4+</TD>\n");
      out.write("                                <TD><img src=\"images/Google_chrome.png\" title=\"Google Chrome version 5 or higher\" width=\"24\"/>&nbsp;5+</TD>\n");
      out.write("                                <TD><img src=\"images/safari.png\" title=\"Safari version 5 or higher\" width=\"24\"/>&nbsp;5+</TD>\n");
      out.write("                                <TD><img src=\"images/opera.png\" title=\"Opera version 10.5 or higher\" width=\"24\"/>&nbsp;10.5+</TD>\n");
      out.write("                            </TR>\n");
      out.write("                        </TABLE>\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("    </BODY>\n");
      out.write("</HTML>\n");
      out.write("\n");
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
