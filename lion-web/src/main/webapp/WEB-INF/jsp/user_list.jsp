<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
  <script type="text/javascript" src="${path}/static/easyui/jquery.min.js"></script>
  <script type="text/javascript" src="${path}/static/easyui/jquery.easyui.min.js"></script>
  <script type="text/javascript" src="${path}/static/easyui/locale/easyui-lang-zh_CN.js"></script>
  <link rel="stylesheet" type="text/css" href="${path}/static/easyui/themes/icon.css">
  <link rel="stylesheet" type="text/css" href="${path}/static/easyui/themes/metro/easyui.css">
</head>
<body>
    <table id="user_list" class="easyui-datagrid" style="width:600px; height:400px;"></table>
    <div id="user_dialog" class="easyui-dialog" style="align: center"></div>

        <form id="myform" action="/user/adduser.json" method="post">
           <span>是否是本人</span> <input type="radio" value="yes" name="verResultMap['10012'].result">
            <input type="radio" value="no" name="verResultMap['10012'].result"><br/>
            <span>姓名是否正确</span> <input type="radio" value="yes" name="verResultMap['10013'].result">
            <input type="radio" value="no" name="verResultMap['10013'].result">
            <input type="submit" value="submit">
        </form>
    <div>
        <a id="btn" class="easyui-linkbutton"></a>
    </div>
</body>
<script type="text/javascript" src="${path}/static/js/user_list.js"></script>
</html>
