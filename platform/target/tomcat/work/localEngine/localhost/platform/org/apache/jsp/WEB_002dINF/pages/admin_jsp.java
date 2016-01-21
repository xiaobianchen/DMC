package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"img/favicon.ico\">\r\n");
      out.write("\t<title>登录-DMC,就购了</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"easyui/themes/default/easyui.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"easyui/themes/icon.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"easyui/demo.css\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"easyui/jquery.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t#fm{\r\n");
      out.write("\t\t\tmargin:0;\r\n");
      out.write("\t\t\tpadding:10px 30px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.ftitle{\r\n");
      out.write("\t\t\tfont-size:14px;\r\n");
      out.write("\t\t\tfont-weight:bold;\r\n");
      out.write("\t\t\tcolor:#666;\r\n");
      out.write("\t\t\tpadding:5px 0;\r\n");
      out.write("\t\t\tmargin-bottom:10px;\r\n");
      out.write("\t\t\tborder-bottom:1px solid #ccc;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.fitem{\r\n");
      out.write("\t\t\tmargin-bottom:5px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.fitem label{\r\n");
      out.write("\t\t\tdisplay:inline-block;\r\n");
      out.write("\t\t\twidth:80px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tvar url;\r\n");
      out.write("\r\n");
      out.write("\t\t/*create new user*/\r\n");
      out.write("\t\tfunction newUser(){\r\n");
      out.write("\t\t\t$('#dlg').dialog('open').dialog('setTitle','新建用户');\r\n");
      out.write("\t\t\t$('#fm').form('clear');\r\n");
      out.write("\t\t\turl = 'admin/addUser';\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t/*edit user*/\r\n");
      out.write("\t\tfunction editUser(){\r\n");
      out.write("\t\t\t$.messager.show({\r\n");
      out.write("\t\t\t\ttitle: '提示信息',\r\n");
      out.write("\t\t\t\tmsg: 'DMC系统由于权限原因只能编辑用户密码,如有疑问请联系管理员!'\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tvar row = $('#dg').datagrid('getSelected');\r\n");
      out.write("\t\t\tif (row){\r\n");
      out.write("\t\t\t\t$('#dlg').dialog('open').dialog('setTitle','编辑用户');\r\n");
      out.write("\t\t\t\t$('#fm').form('load',row);\r\n");
      out.write("\t\t\t\turl ='admin/updateUser';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t/*save user*/\r\n");
      out.write("\t\tfunction saveUser(){\r\n");
      out.write("\t\t\t$('#fm').form('submit',{\r\n");
      out.write("\t\t\t\turl: url,\r\n");
      out.write("\t\t\t\tonSubmit: function(){\r\n");
      out.write("\t\t\t\t\treturn $(this).form('validate');\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tsuccess: function(result){\r\n");
      out.write("\t\t\t\t\tvar result = eval('('+result+')');\r\n");
      out.write("\t\t\t\t\tif (result.success){\r\n");
      out.write("\t\t\t\t\t\t$.messager.show({\r\n");
      out.write("\t\t\t\t\t\ttitle:'Info',\r\n");
      out.write("\t\t\t\t\t\tmsg:'更新用户成功!',\r\n");
      out.write("\t\t\t\t\t\tshowType:'fade',\r\n");
      out.write("\t\t\t\t\t\tstyle:{\r\n");
      out.write("\t\t\t\t\t\t\tright:'',\r\n");
      out.write("\t\t\t\t\t\t\tbottom:''\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t$('#dlg').dialog('close');\t\t// close the dialog\r\n");
      out.write("\t\t\t\t\t\t$('#dg').datagrid('reload');\t// reload the user data\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t$.messager.show({\r\n");
      out.write("\t\t\t\t\t\t\ttitle: '错误信息',\r\n");
      out.write("\t\t\t\t\t\t\tmsg: '更新用户信息失败,请联系管理员!'\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t/*remove user*/\r\n");
      out.write("\t\tfunction removeUser(){\r\n");
      out.write("\t\t\tvar row = $('#dg').datagrid('getSelected');\r\n");
      out.write("\t\t\tif (row){\r\n");
      out.write("\t\t\t\t$.messager.confirm('Confirm','你确定要删除用户吗?',function(r){\r\n");
      out.write("\t\t\t\t\tif (r){\r\n");
      out.write("\t\t\t\t\t\t$.post('admin/removeUser',{id:row.username},function(result){\r\n");
      out.write("\t\t\t\t\t\t\tif (result.success){\r\n");
      out.write("\t\t\t\t\t\t\t\t$.messager.show({\r\n");
      out.write("\t\t\t\t\t\ttitle:'Info',\r\n");
      out.write("\t\t\t\t\t\tmsg:'删除用户成功!',\r\n");
      out.write("\t\t\t\t\t\tshowType:'fade',\r\n");
      out.write("\t\t\t\t\t\tstyle:{\r\n");
      out.write("\t\t\t\t\t\t\tright:'',\r\n");
      out.write("\t\t\t\t\t\t\tbottom:''\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#dg').datagrid('reload');// reload the user data\r\n");
      out.write("\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t$.messager.show({\t// show error message\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle: '错误信息',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tmsg: '删除用户失败,请联系管理员!'\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t},'json');\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction doSearch(){\r\n");
      out.write("\t\t\t$('#dg').datagrid('load',{\r\n");
      out.write("\t\t\tsearchConditions: $('#search').val()\r\n");
      out.write("\t\t});\r\n");
      out.write("}\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("        <h2 align=\"center\"><span style=\"color:dodgerblue\">DMC用户管理</span></h2>\r\n");
      out.write("        <div class=\"demo-info\" style=\"margin-bottom:10px\">\r\n");
      out.write("            <div class=\"demo-tip icon-tip\">&nbsp;</div>\r\n");
      out.write("        </div>\r\n");
      out.write("\t\r\n");
      out.write("        <table id=\"dg\" title=\"用户管理\" class=\"easyui-datagrid\" style=\"width:100%;height:800px;\"\r\n");
      out.write("                url=\"admin/listUsers\"\r\n");
      out.write("                toolbar=\"#toolbar\" pagination=\"true\"\r\n");
      out.write("                rownumbers=\"true\" fitColumns=\"true\" singleSelect=\"true\">\r\n");
      out.write("            <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th field=\"username\" width=\"20\">用户名</th>\r\n");
      out.write("                    <th field=\"password\" width=\"30\">密码</th>\r\n");
      out.write("                    <th field=\"email\" width=\"30\">邮箱</th>\r\n");
      out.write("                    <th field=\"phone\" width=\"30\">电话</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"toolbar\">\r\n");
      out.write("            <a href=\"javascript:void(0);\" class=\"easyui-linkbutton\" iconCls=\"icon-add\" plain=\"true\" onclick=\"newUser()\">新建用户</a>\r\n");
      out.write("            <a href=\"javascript:void(0);\" class=\"easyui-linkbutton\" iconCls=\"icon-edit\" plain=\"true\" onclick=\"editUser()\">编辑用户</a>\r\n");
      out.write("            <a href=\"javascript:void(0);\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\" onclick=\"removeUser()\">删除用户</a>\r\n");
      out.write("            <div>\r\n");
      out.write("                <span>搜索:</span>\r\n");
      out.write("                <input id=\"search\" style=\"line-height:26px;border:1px solid #ccc\">\r\n");
      out.write("                <a href=\"javascript:void(0);\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search'\" style=\"width:80px\" onclick=\"doSearch()\">Search</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\t\r\n");
      out.write("        <div id=\"dlg\" class=\"easyui-dialog\" style=\"width:400px;height:280px;padding:10px 20px\"\r\n");
      out.write("                closed=\"true\" buttons=\"#dlg-buttons\">\r\n");
      out.write("            <div class=\"ftitle\">用户信息</div>\r\n");
      out.write("            <form id=\"fm\" method=\"post\" novalidate>\r\n");
      out.write("                <div class=\"fitem\">\r\n");
      out.write("                    <label>用户名:</label>\r\n");
      out.write("                    <input name=\"username\" class=\"easyui-validatebox\" required=\"true\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"fitem\">\r\n");
      out.write("                    <label>密码:</label>\r\n");
      out.write("                    <input name=\"password\" class=\"easyui-validatebox\" required=\"true\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"fitem\">\r\n");
      out.write("                    <label>邮箱:</label>\r\n");
      out.write("                    <input name=\"email\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"fitem\">\r\n");
      out.write("                    <label>电话:</label>\r\n");
      out.write("                    <input name=\"phone\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"dlg-buttons\">\r\n");
      out.write("            <a href=\"javascript:void(0);\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\" onclick=\"saveUser()\">保存</a>\r\n");
      out.write("            <a href=\"javascript:void(0);\" class=\"easyui-linkbutton\" iconCls=\"icon-cancel\" onclick=\"javascript:$('#dlg').dialog('close')\">取消</a>\r\n");
      out.write("        </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
