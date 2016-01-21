<%--
  Created by IntelliJ IDEA.
  User: xiaobianchen
  Date: 15/10/26
  Time: 下午11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv= "Refresh" content= "5;url=/DMC">
    <link rel="shortcut icon" href="img/favicon.ico">
    <title>登录-DMC,就购了</title>
    <script type="text/javascript">
        var times=6;
        clock();
        function clock()
        {
            window.setTimeout('clock()',1000);
            times=times-1;
            time.innerHTML =times;
        }
    </script>
</head>
<body>

    <img src="img/404.jpg">
    <table align="center" style="color:dodgerblue;">
        <tr style="font-size: 28px">
            <td>
                <div id="time">5</div>
            </td>
            <td>秒后返回首页</td>
        </tr>
    </table>


</body>
</html>
