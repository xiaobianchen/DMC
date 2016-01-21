package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "main.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>登录</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"clsbody\">\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("\t<img src=\"img/dmc.ico\" alt=\"DMC\" class=\"clslogo\">\r\n");
      out.write("\t<div class=\"logo\">\r\n");
      out.write("\t\t<h1><font color=\"black\">DMC 欢迎登录</font></h1>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 登陆窗口 begin -->\r\n");
      out.write("<div class=\"login-module\">\r\n");
      out.write("\t<div class=\"login-banner\">\r\n");
      out.write("\t   <div class=\"inner\">\r\n");
      out.write("\t\t\t<div class=\"login-form\">\r\n");
      out.write("\t\t\t\t<form method=\"post\" id=\"form\">\r\n");
      out.write("\t\t\t\t\t<i class=\"icon icon-close\"></i>\r\n");
      out.write("\t\t\t\t\t<div class=\"input-box\">\r\n");
      out.write("\t\t\t\t\t\t<label>\r\n");
      out.write("\t\t\t\t\t\t\t登录名\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"username\" id=\"username\" onblur=\"checkUserIsExist();\"/>\r\n");
      out.write("\t\t\t\t\t\t\t<span id=\"checkUser\">用户名不能为空 </span>\r\n");
      out.write("\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"input-box\">\r\n");
      out.write("\t\t\t\t\t\t<label>\r\n");
      out.write("\t\t\t\t\t\t\t登陆密码\r\n");
      out.write("\t\t\t\t\t\t\t<a id=\"resetPwd\" href=\"/platform/resetPwd\" class=\"floatR\">修改登录密码</a>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" id=\"password\"/>\r\n");
      out.write("\t\t\t\t\t\t\t<span id=\"checkPwd\">密码不能为空 </span>\r\n");
      out.write("\t\t\t\t\t\t\t<span id=\"existPwd\">密码不正确, 请确认</span>\r\n");
      out.write("\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"check-box clearfix\">\r\n");
      out.write("\t\t\t\t\t\t<label>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"ck_rmbUser\"/>记住密码\r\n");
      out.write("\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"btn-box\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"img/btn-login.png\" style=\"width: 100%;\" onclick=\"return checkForm();\"/>\r\n");
      out.write("\t\t\t\t\t\t<label>\r\n");
      out.write("\t\t\t\t\t\t\t<a id=\"register\" href=\"/platform/register\" style=\"float:right;margin-top:5px;\">免费注册</a>\r\n");
      out.write("\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
