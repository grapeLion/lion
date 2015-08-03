<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  request.setAttribute("path", path);
%>
<html>
<head>
    <title></title>
    <script type="text/javascript" src="${path}/static/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="${path}/jquery.min.js"></script>
    <script type="text/javascript" src="${path}/static/easyui/jquery.easyui.min.js"></script>
    <link rel="stylesheet" type="text/css" href="${path}/static/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${path}/static/easyui/themes/metro/easyui.css">
    <link rel="stylesheet" type="text/css" href="${path}/static/easyui/locale/easyui-lang-zh_CN.js">
</head>
<body>
      <div id="myPanel" class="easyui-window" title="测试表单" style="width:300px;height:400px;">
            <h1>aaaaa${path}</h1>
      </div>


</body>
</html>
