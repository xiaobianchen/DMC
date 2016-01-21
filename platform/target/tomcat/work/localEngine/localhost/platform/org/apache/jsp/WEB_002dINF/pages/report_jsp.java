package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class report_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <title>登录-DMC,就购了</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/icon.css\">\r\n");
      out.write("  <link rel=\"shortcut icon\" href=\"img/favicon.ico\">\r\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery-1.10.2.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"js/highcharts.js\"></script>\r\n");
      out.write("  <script>\r\n");
      out.write("    $(function () {\r\n");
      out.write("      $('#container').highcharts({\r\n");
      out.write("        chart: {\r\n");
      out.write("          type: 'spline',  //图表的显示类型（line,spline,scatter,splinearea bar,pie,area,column）\r\n");
      out.write("          marginRight: 125,//上下左右空隙\r\n");
      out.write("          marginBottom: 25 //上下左右空隙\r\n");
      out.write("        },\r\n");
      out.write("        title: {\r\n");
      out.write("          text: 'Data Analysis Chart'\r\n");
      out.write("        },\r\n");
      out.write("        xAxis: {\r\n");
      out.write("          categories: ['my', 'first', 'chart']\r\n");
      out.write("        },\r\n");
      out.write("        yAxis: {\r\n");
      out.write("          title: {\r\n");
      out.write("            text: 'something'\r\n");
      out.write("          }\r\n");
      out.write("        },\r\n");
      out.write("        series: [{\r\n");
      out.write("          name: 'Jane',\r\n");
      out.write("          data: [1, 0, 4]\r\n");
      out.write("        }, {\r\n");
      out.write("          name: 'John',\r\n");
      out.write("          data: [5, 7, 3]\r\n");
      out.write("        }]\r\n");
      out.write("      });\r\n");
      out.write("    });\r\n");
      out.write("  </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("     <div id=\"container\" style=\"min-width:800px;height:400px;\"></div>\r\n");
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
