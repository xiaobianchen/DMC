<%--
  Created by IntelliJ IDEA.
  User: jchen19
  Date: 2015/12/24
  Time: 13:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="main.jsp"/>
<html>
<head>
  <title></title>
  <script type="text/javascript">

    // unblock when ajax activity stops
    $(document).ajaxStop($.unblockUI);

    function test() {
      $.ajax({ url: 'wait.php', cache: false });
    }

    $(document).ready(function() {
      $('#searchButton').click(function() {
        alert(22);
        $.blockUI();
        test();
      });
    });

  </script>

</head>
<body>
<div class="conditionAlone"><input type="button" id="searchButton" value="查  询"/></div>
</body>
</html>
