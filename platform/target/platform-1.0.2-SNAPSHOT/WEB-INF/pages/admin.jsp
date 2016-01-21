<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%--<jsp:include page="authorized.jsp"/>--%>
<jsp:include page="footer.jsp"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="shortcut icon" href="img/favicon.ico">
	<title>登录-DMC,就购了</title>
	<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="easyui/demo.css">
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>

	<style type="text/css">
		#fm{
			margin:0;
			padding:10px 30px;
		}
		.ftitle{
			font-size:14px;
			font-weight:bold;
			color:#666;
			padding:5px 0;
			margin-bottom:10px;
			border-bottom:1px solid #ccc;
		}
		.fitem{
			margin-bottom:5px;
		}
		.fitem label{
			display:inline-block;
			width:80px;
		}
	</style>
	<script type="text/javascript">
		var url;

		/*create new user*/
		function newUser(){
			$('#dlg').dialog('open').dialog('setTitle','新建用户');
			$('#fm').form('clear');
			url = 'admin/addUser';
		}

		/*edit user*/
		function editUser(){
			$.messager.show({
				title: '提示信息',
				msg: 'DMC系统由于权限原因只能编辑用户密码,如有疑问请联系管理员!'
			});
			var row = $('#dg').datagrid('getSelected');
			if (row){
				$('#dlg').dialog('open').dialog('setTitle','编辑用户');
				$('#fm').form('load',row);
				url ='admin/updateUser';
			}
		}

		/*save user*/
		function saveUser(){
			$('#fm').form('submit',{
				url: url,
				onSubmit: function(){
					return $(this).form('validate');
				},
				success: function(result){
					var result = eval('('+result+')');
					if (result.success){
						$.messager.show({
						title:'Info',
						msg:'更新用户成功!',
						showType:'fade',
						style:{
							right:'',
							bottom:''
							}
						});
						$('#dlg').dialog('close');		// close the dialog
						$('#dg').datagrid('reload');	// reload the user data
					} else {
						$.messager.show({
							title: '错误信息',
							msg: '更新用户信息失败,请联系管理员!'
						});
					}
				}
			});
		}
		/*remove user*/
		function removeUser(){
			var row = $('#dg').datagrid('getSelected');
			if (row){
				$.messager.confirm('Confirm','你确定要删除用户吗?',function(r){
					if (r){
						$.post('admin/removeUser',{id:row.username},function(result){
							if (result.success){
								$.messager.show({
						title:'Info',
						msg:'删除用户成功!',
						showType:'fade',
						style:{
							right:'',
							bottom:''
							}
						});
								$('#dg').datagrid('reload');// reload the user data
							} else {
								$.messager.show({	// show error message
									title: '错误信息',
									msg: '删除用户失败,请联系管理员!'
								});
							}
						},'json');
					}
				});
			}
		}
		function doSearch(){
			$('#dg').datagrid('load',{
			searchConditions: $('#search').val()
		});
}
		
	</script>
</head>
<body>
        <h2 align="center"><span style="color:dodgerblue">DMC用户管理</span></h2>
        <div class="demo-info" style="margin-bottom:10px">
            <div class="demo-tip icon-tip">&nbsp;</div>
        </div>
	
        <table id="dg" title="用户管理" class="easyui-datagrid" style="width:100%;height:800px;"
                url="admin/listUsers"
                toolbar="#toolbar" pagination="true"
                rownumbers="true" fitColumns="true" singleSelect="true">
            <thead>
                <tr>
                    <th field="username" width="20">用户名</th>
                    <th field="password" width="30">密码</th>
                    <th field="email" width="30">邮箱</th>
                    <th field="phone" width="30">电话</th>
                </tr>
            </thead>
        </table>

        <div id="toolbar">
            <a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">新建用户</a>
            <a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">编辑用户</a>
            <a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="removeUser()">删除用户</a>
            <div>
                <span>搜索:</span>
                <input id="search" style="line-height:26px;border:1px solid #ccc">
                <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-search'" style="width:80px" onclick="doSearch()">Search</a>
            </div>
        </div>
	
        <div id="dlg" class="easyui-dialog" style="width:400px;height:280px;padding:10px 20px"
                closed="true" buttons="#dlg-buttons">
            <div class="ftitle">用户信息</div>
            <form id="fm" method="post" novalidate>
                <div class="fitem">
                    <label>用户名:</label>
                    <input name="username" class="easyui-validatebox" required="true">
                </div>
                <div class="fitem">
                    <label>密码:</label>
                    <input name="password" class="easyui-validatebox" required="true">
                </div>
                <div class="fitem">
                    <label>邮箱:</label>
                    <input name="email">
                </div>
                <div class="fitem">
                    <label>电话:</label>
                    <input name="phone">
                </div>
            </form>
        </div>

        <div id="dlg-buttons">
            <a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveUser()">保存</a>
            <a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">取消</a>
        </div>
</body>
</html>