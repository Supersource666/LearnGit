/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2021-11-04 08:51:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.note;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-md-9\">\r\n");
      out.write("    <div class=\"data_list\">\r\n");
      out.write("        <div class=\"data_list_title\">\r\n");
      out.write("            <span class=\"glyphicon  glyphicon-list\"></span>&nbsp;添加云记\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"row\" style=\"padding-top: 20px;\">\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                                <div class=\"col-sm-12\">\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("                                       <form class=\"form-horizontal\" method=\"post\" action=\"note\">\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("                                           <div class=\"form-group\">\r\n");
      out.write("                                               <label for=\"typeId\" class=\"col-sm-2 control-label\">类别</label>\r\n");
      out.write("                                               <div class=\"col-sm-8\">\r\n");
      out.write("                                                   <select id=\"typeId\" class=\"form-control\" name=\"typeId\">\r\n");
      out.write("                                                       <option value=\"-1\">请选择云记类别...</option>\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("                                                   </select>\r\n");
      out.write("                                               </div>\r\n");
      out.write("                                           </div>\r\n");
      out.write("                                           <div class=\"form-group\">\r\n");
      out.write("                                               <label for=\"title\" class=\"col-sm-2 control-label\">标题</label>\r\n");
      out.write("                                               <div class=\"col-sm-8\">\r\n");
      out.write("                                                   <input class=\"form-control\" name=\"title\" id=\"title\" placeholder=\"云记标题\" value=\"12\">\r\n");
      out.write("                                               </div>\r\n");
      out.write("                                           </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"title\" class=\"col-sm-2 control-label\">内容</label>\r\n");
      out.write("                                    <div class=\"col-sm-8\">\r\n");
      out.write("                                        ");
      out.write("\r\n");
      out.write("                                        <textarea id =\"content\" name=\"content\"></textarea>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <div class=\"col-sm-offset-4 col-sm-4\"></div>\r\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-primary\" onclick=\"returnCheckForm();\" value=\"保存\">\r\n");
      out.write("                                    <font id=\"error\" color=\"red\"></font>\r\n");
      out.write("                                </div>\r\n");
      out.write("                               </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                 </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("     </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write(" // $(function(){\r\n");
      out.write(" //     var editor =new UE.ui.Editor({initialFrameHeight:'100%',initialFrameWidth:'100%'});\r\n");
      out.write(" //     editor.render(\"Editor\");\r\n");
      out.write(" // });\r\n");
      out.write("    $(function (){\r\n");
      out.write("    //加载富文本编辑器\r\n");
      out.write("        var ue =UE.getEditor('content');\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    // function CheckForm(){\r\n");
      out.write("    //   var typeId=$(\"#typeId\").val();\r\n");
      out.write("    //   var title=$(\"#title\").val();\r\n");
      out.write("    // }\r\n");
      out.write("</script>");
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
