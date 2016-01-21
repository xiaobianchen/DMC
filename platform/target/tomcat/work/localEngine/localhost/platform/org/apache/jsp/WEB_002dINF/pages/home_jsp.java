package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dmc.domain.Login;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf8");
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
      out.write("<!DOCTYPE html>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "main.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write('\r');
      out.write('\n');

   Login user = (Login)request.getSession().getAttribute("login");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"zh-cn\" data-lang=\"zh-cn\" data-template=\"simple\" class=\"lang-zh-cn\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\"/>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"platform\">\r\n");
      out.write("    <meta name=\"description\" content=\"登录DMC,就够了\">\r\n");
      out.write("    <title>登录DMC,就够了</title>\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"img/favicon.ico\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/base.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/index_base.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/page_contact.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-1.10.2.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/bootstrap.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(document).ready(function() {\r\n");
      out.write("            $('.carousel').carousel({\r\n");
      out.write("                interval: 5000\r\n");
      out.write("            })\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"page\">\r\n");
      out.write("    <div class=\"page-head navbar-default\">\r\n");
      out.write("        <div class=\"head\">\r\n");
      out.write("            <div class=\"navbar\">\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li class=\"active\"><a href=\"/platform\">首页</a></li>\r\n");
      out.write("                    <li class=\"nav-dropdown \">\r\n");
      out.write("                        <a href=\"javascript:void(0);\">产品</a>\r\n");
      out.write("                        <ul class=\"nav-dropdown-list\">\r\n");
      out.write("                            <li><a target=\"_blank\" href=\"/platform/cstools\">数据中心</a></li>\r\n");
      out.write("                            <li><a target=\"_blank\" href=\"/platform/report\">报表服务</a></li>\r\n");
      out.write("                            <li><a target=\"_blank\" href=\"/platform/admin\">用户管家</a></li>\r\n");
      out.write("                            <li><a target=\"_blank\" href=\"/platform/flow\">流量通道</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"\"><a href=\"#\">支持中心</a>\r\n");
      out.write("                        <ul class=\"nav-dropdown-list\">\r\n");
      out.write("                            <li><a target=\"_blank\" href=\"/platform/support\">后台管理</a></li>\r\n");
      out.write("                            <li><a target=\"_blank\" href=\"/platform/support/log\">日志管理</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"\"><a href=\"#\">成功案例</a></li>\r\n");
      out.write("                    <li class=\"\"><a href=\"#\">关于我们</a></li>\r\n");
      out.write("                    <li><a href=\"#\" target=\"_blank\">社区</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            ");

              if(user !=null){
                  
      out.write("\r\n");
      out.write("                  <div class=\"account-dropbox\">\r\n");
      out.write("                      欢迎您,\r\n");
      out.write("                  <a class=\"login-a ml10\" href=\"/platform/login\">");
      out.print( user.getUsername());
      out.write("</a>\r\n");
      out.write("                          &nbsp;<span class=\"divider\">|</span>&nbsp;\r\n");
      out.write("                  <a href=\"/platform/login\">退出</a>\r\n");
      out.write("                  </div>\r\n");
      out.write("            ");
 }
             else{
                  
      out.write("\r\n");
      out.write("                  <div class=\"account-dropbox\">\r\n");
      out.write("                  <a class=\"login-a ml10\" href=\"/platform/login\">登录</a>\r\n");
      out.write("                          &nbsp;<span class=\"divider\">|</span>&nbsp;\r\n");
      out.write("                  <a href=\"/platform/register\">注册</a>\r\n");
      out.write("                  </div>\r\n");
      out.write("            ");
 }
           
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"page-contact-btn\">\r\n");
      out.write("        <ul class=\"contact-ul\">\r\n");
      out.write("            <li class=\"contact-li ent\">\r\n");
      out.write("                <a class=\"contact-item ent-item\" id=\"consult\" href=\"javascript:void(0);\"></a>\r\n");
      out.write("                <div class=\"consult-box\">\r\n");
      out.write("                    <div class=\"consult-intro\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li>客户经理：何文斌</li>\r\n");
      out.write("                            <li>联系电话：027-62675942</li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <div class=\"consult-mask\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"consult-modal\">\r\n");
      out.write("                            <p class=\"modal-ptop\"><a target=\"_blank\" href=\"#\">升级企业版</a>，将获得一对一专属技术支持</p>\r\n");
      out.write("                            <p class=\"modal-pbottom\">亲，还可以<a target=\"_blank\" href=\"#\">预约人工咨询</a>哦~</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p class=\"consult-way\">社区：<a target=\"_blank\" href=\"/platform/feedback\">去反馈</a>&nbsp;&nbsp;\r\n");
      out.write("                        查看反馈信息：<a target=\"_blank\" href=\"/platform/list\">查询反馈信息</a></p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <li class=\"contact-li qrcode\">\r\n");
      out.write("                <a class=\"contact-item qrcode-item\" href=\"javascript:void(0);\"></a>\r\n");
      out.write("                <div class=\"qrcode-box\">\r\n");
      out.write("                    <img src=\"img/weixin.png\" alt=\"DMCAppEngine\">\r\n");
      out.write("                    <p>DMC微信公众号</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"myCarousel\" class=\"carousel slide\">\r\n");
      out.write("        <ol class=\"carousel-indicators\">\r\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\r\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\r\n");
      out.write("        </ol>\r\n");
      out.write("        <div class=\"carousel-inner\"> \r\n");
      out.write("            <div class=\"item active\">\r\n");
      out.write("                <img src=\"img/5.jpg\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <img src=\"img/4.jpg\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <img src=\"img/2.jpg\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <img src=\"img/3.jpg\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"page-footer\">\r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("            <div class=\"footer-item\">\r\n");
      out.write("                <div class=\"footer-title\">\r\n");
      out.write("                    <h4>产品</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"footer-link\">\r\n");
      out.write("                    <li><a target=\"_blank\" href=\"#\">数据神经元</a></li><li><a target=\"_blank\" href=\"#\">用户神经元</a></li><li><a target=\"_blank\" href=\"#\">DMC 存储</a></li><li><a target=\"_blank\" href=\"#\">DMC 商店</a></li></ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"footer-item\">\r\n");
      out.write("                <div class=\"footer-title\">\r\n");
      out.write("                    <h4>支持中心</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"footer-link\">\r\n");
      out.write("                    <li><a href=\"#\">产品文档</a></li>\r\n");
      out.write("                    <li><a href=\"#\">常见问题</a></li>\r\n");
      out.write("                    <li><a href=\"#\">DMC论坛</a></li>\r\n");
      out.write("                    <li><a href=\"#\">联系我们</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"footer-item\">\r\n");
      out.write("                <div class=\"footer-title\">\r\n");
      out.write("                    <h4>成功案例</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"footer-link\">\r\n");
      out.write("                    <li><a href=\"#\">天猫</a></li>\r\n");
      out.write("                    <li><a href=\"#\">淘宝</a></li>\r\n");
      out.write("                    <li><a href=\"#\">京东</a></li>\r\n");
      out.write("                    <li><a href=\"#\">社交</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"footer-item\">\r\n");
      out.write("                <div class=\"footer-title\">\r\n");
      out.write("                    <h4>关于我们</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"footer-link\">\r\n");
      out.write("                    <li><a href=\"#\">招聘信息</a></li>\r\n");
      out.write("                    <li><a href=\"#\">平台架构</a></li>\r\n");
      out.write("                    <li><a href=\"#\">用户协议</a></li>\r\n");
      out.write("                    <li><a href=\"#\">信息举报</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"footer-item follow-item\">\r\n");
      out.write("                <div class=\"footer-title\">\r\n");
      out.write("                    <h4>关注我们</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <p class=\"mb10 fs12\">微信关注</p>\r\n");
      out.write("                <div class=\"app-download\">\r\n");
      out.write("                    <a href=\"#\"><img src=\"img/weixin.png\"></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"follow-us mt10\">\r\n");
      out.write("                    <span class=\"weibo\"><a href=\"http://weibo.com/\" title=\"微博\"></a></span>\r\n");
      out.write("                    <span class=\"weixin\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"footer-item\">\r\n");
      out.write("                <div class=\"footer-title\">\r\n");
      out.write("                    <h4>可信性认证</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"true-cloud\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li>存储服务&nbsp;NO：02008</li>\r\n");
      out.write("                        <li>数据服务&nbsp;NO：03009</li>\r\n");
      out.write("                        <li>引擎服务&nbsp;NO：04012</li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
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
