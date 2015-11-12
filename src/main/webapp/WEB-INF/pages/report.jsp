<%--
  Created by IntelliJ IDEA.
  User: jchen19
  Date: 2015/11/5
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="authorized.jsp"/>
<html>
<head>
  <title>登录-DMC,就购了</title>
  <link rel="stylesheet" href="css/icon.css">
  <link rel="shortcut icon" href="img/favicon.ico">
  <script type="text/javascript" src="js/jquery-1.10.2.js"></script>
  <script type="text/javascript" src="js/highcharts.js"></script>
  <script>
    $(function () {
      $('#container').highcharts({
        chart: {
          type: 'spline',  //图表的显示类型（line,spline,scatter,splinearea bar,pie,area,column）
          marginRight: 125,//上下左右空隙
          marginBottom: 25 //上下左右空隙
        },
        title: {
          text: 'Data Analysis Chart'
        },
        xAxis: {
          categories: ['my', 'first', 'chart']
        },
        yAxis: {
          title: {
            text: 'something'
          }
        },
        series: [{
          name: 'Jane',
          data: [1, 0, 4]
        }, {
          name: 'John',
          data: [5, 7, 3]
        }]
      });
    });
  </script>
</head>


<body>
     <div id="container" style="min-width:800px;height:400px;"></div>
</body>
</html>
