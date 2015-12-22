<%--
  Created by IntelliJ IDEA.
  User: jchen19
  Date: 2015/11/26
  Time: 9:48
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
  <title>shCircleLoader Examples</title>
  <script src="http://code.jquery.com/jquery-2.0.3.min.js" type="text/javascript"></script>
  <script src="js/jquery.shCircleLoader.js" type="text/javascript"></script>
  <style type="text/css">
    body {text-align:center;}
    div[id] {width:100px; height:100px; margin:10px auto;}
    span {font-family:monospace;font-size: 14px}
    pre {text-align:left;margin:0 auto;border:1px solid #888;padding:3px;width:400px;background:#eee}
    .myns > div {
      box-shadow: 0 0 6px black, inset 0 0 6px black;
    }
  </style>
</head>
<body>
<hr />
<input type="button" value="submit" onclick="submitInfo();">
<div id="shclKeyframes"></div>

<script type="text/javascript">
  function submitInfo(){
    $('#shclKeyframes').shCircleLoader({keyframes:"0%{background:black}40%{background:transparent}60%{background:transparent}100%{background:black}"});
    window.location.href="http://wwww.baidu.com";
  }
</script>

</body>
</html>
