package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title></title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("      .copyright {\r\n");
      out.write("        width: 1000px;\r\n");
      out.write("        height: 50px;\r\n");
      out.write("        line-height: 50px;\r\n");
      out.write("        margin: 0 auto;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        font-size: 12px;\r\n");
      out.write("        font-family: \"hiragino sans gb\",\"microsoft yahei\";\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .links {\r\n");
      out.write("        text-align: center;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <footer class=\"footer navbar-fixed-bottom \">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"links\">\r\n");
      out.write("        <a rel=\"nofollow\" target=\"_blank\" href=\"#\" style=\"outline: rgb(109, 109, 109) none 0px;\">\r\n");
      out.write("          关于我们\r\n");
      out.write("        </a>\r\n");
      out.write("        |\r\n");
      out.write("        <a rel=\"nofollow\" target=\"_blank\" href=\"#\">\r\n");
      out.write("          联系我们\r\n");
      out.write("        </a>\r\n");
      out.write("        |\r\n");
      out.write("        <a rel=\"nofollow\" target=\"_blank\" href=\"#\">\r\n");
      out.write("          人才招聘\r\n");
      out.write("        </a>\r\n");
      out.write("        |\r\n");
      out.write("        <a rel=\"nofollow\" target=\"_blank\" href=\"#\">\r\n");
      out.write("          商家入驻\r\n");
      out.write("        </a>\r\n");
      out.write("        |\r\n");
      out.write("        <a rel=\"nofollow\" target=\"_blank\" href=\"#\">\r\n");
      out.write("          广告服务\r\n");
      out.write("        </a>\r\n");
      out.write("        |\r\n");
      out.write("        <a target=\"_blank\" href=\"#\">\r\n");
      out.write("          销售联盟\r\n");
      out.write("        </a>\r\n");
      out.write("        |\r\n");
      out.write("        <a href=\"#\" target=\"_blank\">\r\n");
      out.write("          社区\r\n");
      out.write("        </a>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"copyright\">Copyright © 2014-2015 XLTech Corporation All Rights Reserved.\r\n");
      out.write("        <a href=\"#\" target=\"_blank\">鄂ICP证000008-168</a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
