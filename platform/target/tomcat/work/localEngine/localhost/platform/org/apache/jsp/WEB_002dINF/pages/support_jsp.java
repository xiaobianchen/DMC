package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class support_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <title>DMC后台管理中心</title>\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"img/favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("    <link href=\"//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/dashboard.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"//cdn.bootcss.com/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\"\r\n");
      out.write("                    aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">DMC后台管理</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                <li><a href=\"/DMC\">主页</a></li>\r\n");
      out.write("                <li><a href=\"#\">设置</a></li>\r\n");
      out.write("                <li><a href=\"#\">详情</a></li>\r\n");
      out.write("                <li><a href=\"#\">帮助</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <form class=\"navbar-form navbar-right\">\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-sm-3 col-md-2 sidebar\">\r\n");
      out.write("            <ul class=\"nav nav-sidebar\">\r\n");
      out.write("                <li class=\"active\"><a href=\"#\">后台管理中心 <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                <li><a href=\"#\">报表管理</a></li>\r\n");
      out.write("                <li><a href=\"#\">数据分析</a></li>\r\n");
      out.write("                <li><a href=\"#\">数据导入</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <ul class=\"nav nav-sidebar\">\r\n");
      out.write("                <li><a href=\"\">用户管理</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <ul class=\"nav nav-sidebar\">\r\n");
      out.write("                <li><a href=\"\">图形管理</a></li>\r\n");
      out.write("                <li><a href=\"\">图形报表</a></li>\r\n");
      out.write("                <li><a href=\"\">图形分析</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main\">\r\n");
      out.write("            <h1 class=\"page-header\">后台管理中心</h1>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row placeholders\">\r\n");
      out.write("                <div class=\"col-xs-6 col-sm-3 placeholder\">\r\n");
      out.write("                    <img data-src=\"pie.png\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\r\n");
      out.write("                    <h4>用户管理</h4>\r\n");
      out.write("                    <span class=\"text-muted\">Something else</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-xs-6 col-sm-3 placeholder\">\r\n");
      out.write("                    <img data-src=\"holder.js/200x200/auto/vine\" class=\"img-responsive\"\r\n");
      out.write("                         alt=\"Generic placeholder thumbnail\">\r\n");
      out.write("                    <h4>报表管理</h4>\r\n");
      out.write("                    <span class=\"text-muted\">Something else</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-xs-6 col-sm-3 placeholder\">\r\n");
      out.write("                    <img data-src=\"holder.js/200x200/auto/sky\" class=\"img-responsive\"\r\n");
      out.write("                         alt=\"Generic placeholder thumbnail\">\r\n");
      out.write("                    <h4>数据分析</h4>\r\n");
      out.write("                    <span class=\"text-muted\">Something else</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-xs-6 col-sm-3 placeholder\">\r\n");
      out.write("                    <img data-src=\"holder.js/200x200/auto/vine\" class=\"img-responsive\"\r\n");
      out.write("                         alt=\"Generic placeholder thumbnail\">\r\n");
      out.write("                    <h4>数据导入</h4>\r\n");
      out.write("                    <span class=\"text-muted\">Something else</span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <h2 class=\"sub-header\">用户管理</h2>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"table-responsive\">\r\n");
      out.write("                <table class=\"table table-striped\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>用户编号</th>\r\n");
      out.write("                        <th>用户姓名</th>\r\n");
      out.write("                        <th>年龄</th>\r\n");
      out.write("                        <th>地址</th>\r\n");
      out.write("                        <th>职位</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>1,001</td>\r\n");
      out.write("                        <td>Lorem</td>\r\n");
      out.write("                        <td>ipsum</td>\r\n");
      out.write("                        <td>dolor</td>\r\n");
      out.write("                        <td>sit</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>1,002</td>\r\n");
      out.write("                        <td>amet</td>\r\n");
      out.write("                        <td>consectetur</td>\r\n");
      out.write("                        <td>adipiscing</td>\r\n");
      out.write("                        <td>elit</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>1,003</td>\r\n");
      out.write("                        <td>Integer</td>\r\n");
      out.write("                        <td>nec</td>\r\n");
      out.write("                        <td>odio</td>\r\n");
      out.write("                        <td>Praesent</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>1,003</td>\r\n");
      out.write("                        <td>libero</td>\r\n");
      out.write("                        <td>Sed</td>\r\n");
      out.write("                        <td>cursus</td>\r\n");
      out.write("                        <td>ante</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>1,004</td>\r\n");
      out.write("                        <td>dapibus</td>\r\n");
      out.write("                        <td>diam</td>\r\n");
      out.write("                        <td>Sed</td>\r\n");
      out.write("                        <td>nisi</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>1,005</td>\r\n");
      out.write("                        <td>Nulla</td>\r\n");
      out.write("                        <td>quis</td>\r\n");
      out.write("                        <td>sem</td>\r\n");
      out.write("                        <td>at</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>1,006</td>\r\n");
      out.write("                        <td>nibh</td>\r\n");
      out.write("                        <td>elementum</td>\r\n");
      out.write("                        <td>imperdiet</td>\r\n");
      out.write("                        <td>Duis</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>1,007</td>\r\n");
      out.write("                        <td>sagittis</td>\r\n");
      out.write("                        <td>ipsum</td>\r\n");
      out.write("                        <td>Praesent</td>\r\n");
      out.write("                        <td>mauris</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>1,008</td>\r\n");
      out.write("                        <td>Fusce</td>\r\n");
      out.write("                        <td>nec</td>\r\n");
      out.write("                        <td>tellus</td>\r\n");
      out.write("                        <td>sed</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>1,009</td>\r\n");
      out.write("                        <td>augue</td>\r\n");
      out.write("                        <td>semper</td>\r\n");
      out.write("                        <td>porta</td>\r\n");
      out.write("                        <td>Mauris</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>1,010</td>\r\n");
      out.write("                        <td>massa</td>\r\n");
      out.write("                        <td>Vestibulum</td>\r\n");
      out.write("                        <td>lacinia</td>\r\n");
      out.write("                        <td>arcu</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>1,011</td>\r\n");
      out.write("                        <td>eget</td>\r\n");
      out.write("                        <td>nulla</td>\r\n");
      out.write("                        <td>Class</td>\r\n");
      out.write("                        <td>aptent</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>1,012</td>\r\n");
      out.write("                        <td>taciti</td>\r\n");
      out.write("                        <td>sociosqu</td>\r\n");
      out.write("                        <td>ad</td>\r\n");
      out.write("                        <td>litora</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>1,013</td>\r\n");
      out.write("                        <td>torquent</td>\r\n");
      out.write("                        <td>per</td>\r\n");
      out.write("                        <td>conubia</td>\r\n");
      out.write("                        <td>nostra</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>1,014</td>\r\n");
      out.write("                        <td>per</td>\r\n");
      out.write("                        <td>inceptos</td>\r\n");
      out.write("                        <td>himenaeos</td>\r\n");
      out.write("                        <td>Curabitur</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>1,015</td>\r\n");
      out.write("                        <td>sodales</td>\r\n");
      out.write("                        <td>ligula</td>\r\n");
      out.write("                        <td>in</td>\r\n");
      out.write("                        <td>libero</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
