package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write(' ');
      out.write("\r\n");
      out.write("\r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <title>登录-DMC,就购了</title>\r\n");
      out.write("  <link rel=\"shortcut icon\" href=\"img/favicon.ico\">\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"easyui/themes/default/easyui.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"easyui/themes/icon.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"easyui/demo.css\">\r\n");
      out.write("\r\n");
      out.write("  <script type=\"text/javascript\" src=\"easyui/jquery.min.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("      /*cstools searchCondition*/\r\n");
      out.write("      $(document).ready(function(){\r\n");
      out.write("          $(\"#searchCondition\").change(function(){\r\n");
      out.write("            $.ajax({\r\n");
      out.write("              type:\"GET\",\r\n");
      out.write("              url:\"/DMC/cstools/query\",\r\n");
      out.write("              data:{\"selectValue\":$(\"#searchCondition option:selected\").val()},\r\n");
      out.write("              success:function(data){\r\n");
      out.write("              }\r\n");
      out.write("            });\r\n");
      out.write("          });\r\n");
      out.write("      });\r\n");
      out.write("\r\n");
      out.write("      /*search data*/\r\n");
      out.write("      function doSearch() {\r\n");
      out.write("        $('#tt').datagrid('load', {\r\n");
      out.write("          source:$('#searchCondition option:selected').text(),\r\n");
      out.write("          date: $('#datePicker').datebox('getValue'),\r\n");
      out.write("          searchConditions: $('#search').val()\r\n");
      out.write("//          firstBranch: $('#firstBranch option:selected').text(),\r\n");
      out.write("//          secondBranch:$('#secondBranch option:selected').text()\r\n");
      out.write("        });\r\n");
      out.write("      }\r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <h1 align=\"center\"><span style=\"color:dodgerblue\">DMC数据查询工具</span></h1>\r\n");
      out.write("  <table id=\"tt\" class=\"easyui-datagrid\" style=\"width:100%;height:1200px\"\r\n");
      out.write("         url=\"cstools/list\" toolbar=\"#tb\"\r\n");
      out.write("         title=\"DMC数据查询\" iconCls=\"icon-save\"\r\n");
      out.write("         rownumbers=\"true\" pagination=\"true\">\r\n");
      out.write("    <thead>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th field=\"merchantName\" width=\"180\">商家名称</th>\r\n");
      out.write("      <th field=\"date\" width=\"100\">日期</th>\r\n");
      out.write("      <th field=\"source\" width=\"180\">来源</th>\r\n");
      out.write("      <th field=\"sourceDetails\" width=\"100\">来源明细</th>\r\n");
      out.write("      <th field=\"accessNum\" width=\"60\">访客数</th>\r\n");
      out.write("      <th field=\"accessChange\" width=\"80\">访客数变化</th>\r\n");
      out.write("      <th field=\"buyerNum\" width=\"60\">买家数</th>\r\n");
      out.write("      <th field=\"buyerChange\" width=\"100\">买家数变化</th>\r\n");
      out.write("      <th field=\"orderTransferRate\" width=\"100\">下单转化率</th>\r\n");
      out.write("      <th field=\"orderTransferChange\" width=\"120\">下单转化率变化</th>\r\n");
      out.write("      <th field=\"payNum\" width=\"100\">支付买家数</th>\r\n");
      out.write("      <th field=\"payBuyerNumChange\" width=\"120\">支付买家数变化</th>\r\n");
      out.write("      <th field=\"payAmount\" width=\"60\">支付金额</th>\r\n");
      out.write("      <th field=\"payAmountChange\" width=\"120\">支付金额变化</th>\r\n");
      out.write("      <th field=\"payTransferRate\" width=\"100\">支付转化率</th>\r\n");
      out.write("      <th field=\"payTransferRateChange\" width=\"100\">支付转化率变化</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("  </table>\r\n");
      out.write("\r\n");
      out.write("  <div id=\"tb\" style=\"padding:3px\">\r\n");
      out.write("    <span>查询条件:</span>\r\n");
      out.write("    <select name=\"searchCondition\" id=\"searchCondition\">\r\n");
      out.write("      ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </select>\r\n");
      out.write("\r\n");
      out.write("    <span>日期:</span>\r\n");
      out.write("    <input class=\"easyui-datebox\" id=\"datePicker\"/>&nbsp;\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <span>搜索:</span>\r\n");
      out.write("    <input id=\"search\" style=\"line-height:23px;border:1px solid #ccc\">\r\n");
      out.write("    <a href=\"javascript:void(0);\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search'\" style=\"width:80px\" onclick=\"doSearch()\">Search</a>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/pages/search.jsp(80,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/search.jsp(80,6) '${dataList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${dataList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/pages/search.jsp(80,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("data");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" style=\"color: #0099FF;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("      ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
