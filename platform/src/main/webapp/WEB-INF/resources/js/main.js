/*登陆遮罩效果*/
function checkForm(){
	$.blockUI({
		message : '<h1>正在登陆中，请稍候……</h1>',
		css : {
		border : '1px solid khaki'
		}
	});

	setTimeout('validate_loginForm()',1000);
}


/*validate login form*/
function validate_loginForm(){
  	var username = $("input[name='username']").val();
  	var password = $("input[name='password']").val();

  	validate_user(username,password);

	/*remember password*/
  	if($("#ck_rmbUser").is(":checked")){
  		$.cookie("rmbUser", "true", { expires: 7 }); //store 7 days cookies
        $.cookie("username", username, { expires: 7 });  
        $.cookie("password", password, { expires: 7 });  
  	}else{
  		$.cookie("rmbUser", "false", { expire: -1 });  
        $.cookie("username", "", { expires: -1 });  
        $.cookie("password", "", { expires: -1 });  
  	}
}

/*validate username and password*/
function validate_user(username,password){
	if(username==''){
	    	$("input[name='username']").focus();
	    	$("#checkUser").css('display','block');
	    	return false;
	}else if(password==''){
	    	$("input[name='password']").focus();
	    	$("#checkPwd").css('display','block');
	    	return false;
	}else {
	    	$.ajax({
	    		type:"POST",
	    		url:"/platform/login",
	    		data:"username=" + username + "&password=" + password,
	    		success:function(data){
	    			if(data=='success'){
	    				location.href="/platform/index";
	    			}else{
						$("#existPwd").css('display','block');
	    				$("#password").focus();
						$.unblockUI();
						return false;
	    			}
	    		}
	    	});
	}
}

/*remember password*/
$(document).ready(function(){
	if($.cookie("rmbUser") == "true"){
		$("#ck_rmbUser").attr("checked",true);
		$("#username").val($.cookie("username"));
		$("#password").val($.cookie("password"));
	}
});

/*remove prompt*/
$(document).ready(function(){
	  $("input").blur(function(){
		  $("#checkUser").css('display','none');
		  $("#checkPwd").css('display','none');
		  $("#checkEmail").css('display','none');
		  $("#checkPwd").css('display','none');
		  $("#checkConfirmPwd").css('display','none');
		  $("#checkPwdAndConfirmPwd").css('display','none');
		  $("#checkPhone").css('display','none');
		  $("#existUser").css('display','none');
		  $("#existEmail").css('display','none');
		  $("#existPhone").css('display','none');
		  $("#checkUserName").css('display','none');
		  $("#checkoldPwd").css('display','none');
		  $("#checknewPwd").css('display','none');
		  $("#checkconfirmNewPwd").css('display','none');
		  $("#checkNewConfirmPwd").css('display','none');
		  $("#details").css('display','none');
		  $("#info").css('display','none');
		  $("#checkoldPassword").css('display','none');
	});
});

/*注册遮罩效果*/
function checkRegisterForm(){
	$.blockUI({
		message : '<h1>用户注册中,请稍候……</h1>',
		css : {
			border : '1px solid khaki'
		}
	});
    setTimeout('validate_regForm()',2000);
}


/*validate register form*/
function validate_regForm(){
     var username = $("input[name='username']").val();
     var password = $("input[name='password1']").val();
     var email = $("input[name='email']").val();
     var phone = $("input[name='phone']").val();
     
     if(username == ''){
    	 $("#checkUser").css('display','block');
         $("input[name='username']").focus();
         return false;
     }else if(password == ''){
          $("#checkPwd").css('display','block');
          $("input[name='password1']").focus();
          return false;
     }else if(email == '' || !/.+@.+\.[a-zA-Z]{2,4}$/.test(email)){
         $("#checkEmail").css('display','block');
         $("input[name='email']").focus();
         return false;
    }else if(phone == '' || !/^1[3|4|5|8][0-9]\d{4,8}$/.test(phone)){
    	 $("#checkPhone").css('display','block');
    	 $("input[name='phone']").focus();
    	 return false;
    }else{
    	 $.ajax({
    		 type:"POST",
    		 url:"/platform/register",
    		 data:"username=" + username + "&password=" + password  + "&email=" + email + "&phone=" + phone,
			 complete : function() {
				 // 数据加载完毕，取消等待画面的遮罩效果
				 $.unblockUI();
			 },
			 success:function(data){
    			if(data == 'success'){
    				//alert("用户注册成功!");
    				location.href='/platform/login';
    			}else if(data == 'error'){
    				alert("该用户已经存在,请确认!");
    				$("#username").focus();
    				return false;
    			}
    		 }
    	 });
     }
}

/*min window*/
function minwin(){ 
      document.getElementsByClassName("module")[0].style.display = "none";
      document.getElementsByClassName("min-window")[0].style.display = "block";
};

/*close window*/
function closewin(){  
      var browserName=navigator.appName;    
        if (browserName=="Netscape") {    
            window.open('','_self','');    
            window.close();     
        } else {    
            window.close();    
        }  
};
   
/*max window*/
function maxwin(){ 
      document.getElementsByClassName("min-window")[0].style.display = "none";
      document.getElementsByClassName("module")[0].style.display = "block";
};
    
/*check user*/
function checkUser(){
	 var username = $("input[name='username']").val();
	  $.ajax({
			 type:"POST",
			 url:"/platform/checkUser",
			 data:"username=" + username,
			 success:function(data){
	 			if(data == 'success'){
	 				$("#existUser").css('display','block');
	 				$("#username").focus();
	 				return false;
	 			}
	 		 }
		 });
}

/*check email*/
function checkEmail(){
	 var email = $("input[name='email']").val();
		$.ajax({
			type:"POST",
			url:"/platform/checkEmail",
			data:"email=" + email,
			success:function(data){
				if(data == 'success'){
					$("#existEmail").css('display','block');
					$("#email").focus();
					return false;
	 			}
			}
		});
}

/*check phone*/
function checkPhone(){
	var phone = $("input[name='phone']").val();
	$.ajax({
		type:"POST",
		url:"/platform/checkPhone",
		data:"phone=" + phone,
		success:function(data){
			if(data == 'success'){
				$("#existPhone").css('display','block');
 				$("input[name='phone']").focus();
 				return false;
 			}
		}
	});
}

/*comments*/
function submitComment(){
	var comments = $("#comments").val();
	var type = $("#contact option:selected").text();
	var contact = $("#contactInfo").val();
	
	if(comments == ''){
		$("#details").css('display','block');
	    $("#comments").focus();
		return false;
	} 
	if(contact==''){
		$("#info").css('display','block');
		$("#contactInfo").focus();
		return false;
	}
	
	$.ajax({
	    type:"POST",
	    url:"/platform/feedback",
	    data:"comments=" + comments + "&type=" + type + "&contact=" + contact,
	    success:function(data){
    		alert('您的建议我们已经收到,我们会尽快分析处理!');
	    	location.href='/platform/index';
	    }
	});
}

/*popup*/
$(document).ready(function(){
	$("#imgsel0").mouseover(function(){
		$("#popup0").css('display','block');
	});
	
	$("#imgsel0").mouseout(function(){
		$("#popup0").css('display','none');
	});
});

/*popup*/
$(document).ready(function(){
	$("#imgsel1").mouseover(function(){
		$("#popup1").css('display','block');
	});
	
	$("#imgsel1").mouseout(function(){
		$("#popup1").css('display','none');
	});
});

/*popup*/
$(document).ready(function(){
	$("#imgsel2").mouseover(function(){
		$("#popup2").css('display','block');
	});
	
	$("#imgsel2").mouseout(function(){
		$("#popup2").css('display','none');
	});
});

/*reset password*/
function resetPwd(){
	var username = $("#username").val();
	var oldPassword = $("#oldpwd").val();
	var password = $("#newpwd").val();
	var confirmPassword = $("#confirmNewPwd").val();
	
	if(username==''){
		$("#checkUserName").css('display','block');
		$("#username").focus();
		return false;
	}else if(oldPassword==''){
		$("#checkoldPwd").css('display','block');
		$("#oldpwd").focus();
		return false;
	}else if(password==''){
		$("#checknewPwd").css('display','block');
		$("#newpwd").focus();
		return false;
	}else if(confirmPassword==''){
		$("#checkconfirmNewPwd").css('display','block');
		$("#confirmNewPwd").focus();
		return false;
	}else if(password!=confirmPassword){
		$("#checkNewConfirmPwd").css('display','block');
		$("#confirmNewPwd").focus();
		return false;
	}else{
		$.ajax({
			type:'POST',
			url:'/platform/resetPwd',
			data:"username=" + username + "&oldPassword=" + oldPassword +　"&password=" + password + "&confirmPassword=" + confirmPassword,
			success:function(data){
				if(data=='success'){
					alert('密码更新成功');
					location.href="/platform/login";
				}else{
					$("#checkoldPassword").css('display','block');
					$("#oldpwd").focus();
					return false;
				}
			}
		});
	}
}
/*DataTable*/
$(document).ready(function(){
	$("#listComments").DataTable({
		    "bProcessing": true,
	        "bServerSide": true,
	        "sort": "position",
	        "bStateSave": false,
	        "iDisplayLength": 10,
	        "iDisplayStart": 0,
	        "fnDrawCallback": function () {
	        },
		   "oLanguage": {
			"sLengthMenu": "每页显示 _MENU_ 条记录",
			"sZeroRecords": "对不起，查询不到任何相关数据",
			"sInfo": "当前显示 _START_ 到 _END_ 条，共 _TOTAL_ 条记录",
			"sInfoEmtpy": "找不到相关数据",
			"sInfoFiltered": "数据表中共为 _MAX_ 条记录",
			"sProcessing": "正在努力加载中...",
			"sSearch": "搜索",
			"sInfoEmpty": "显示 0 至 0 共 0 项",
			"oPaginate": { "sFirst": "第一页", "sPrevious": "上一页 ", "sNext": "下一页 ", "sLast": "末页 " }
		    },
	        "sAjaxSource": "/platform/pagination",
	        "aoColumns": [
				{ "mData": "id" },
				{ "mData": "comments" },
				{ "mData": "type" },
				{ "mData": "contact" },
				{ "mData": "reportTime" },       
	        ]
	});
});

/*csTools*/
$(document).ready(function(){
   $("#queryAll").DataTable({
	    "bProcessing": true,
        "bServerSide": true,
        "sort": false,
        "bStateSave": false,
        "iDisplayLength": 10,
        "iDisplayStart": 0,
        "fnDrawCallback": function () {
        },         
        "sAjaxSource": "/platform/csTools/pagination",
        "oLanguage": {
            "sLengthMenu": "每页显示 _MENU_ 条记录",
            "sZeroRecords": "对不起，查询不到任何相关数据",
            "sInfo": "当前显示 _START_ 到 _END_ 条，共 _TOTAL_ 条记录",
            "sInfoEmtpy": "找不到相关数据",
            "sInfoFiltered": "数据表中共为 _MAX_ 条记录",
            "sProcessing": "正在努力加载中...",
            "sSearch": "搜索",
            "sInfoEmpty": "显示 0 至 0 共 0 项",
            "oPaginate": { "sFirst": "第一页", "sPrevious": "上一页 ", "sNext": "下一页 ", "sLast": "末页 " }
        },
        "aoColumns": [
            { "mData": "merchantName" },
            { "mData": "date" },
            { "mData": "source" },
            { "mData": "sourceDetails" },
            { "mData": "accessNum" },
            { "mData": "accessChange" },
            { "mData": "buyerNum" },
            { "mData": "buyerChange" },
            { "mData": "orderAmount" },
            { "mData": "orderChange" },
            { "mData": "orderTransferRate" },
            { "mData": "orderTransferChange" },
            { "mData": "payNum" },
            { "mData": "payBuyerNumChange" },
            { "mData": "payAmount" },
            { "mData": "payAmountChange" },
            { "mData": "payTransferRate" },
            { "mData": "payTransferRateChange" },
        ]
     });
});

/*Progressbar*/
function progress(){
	var win = $.messager.progress({
		title:'小D正在努力加载中.....',
		msg:'正在调用后台抓取数据中.....',
	});
	
	setTimeout(function(){
		$.messager.progress('close');
	},5000)
};

/*datepicker*/
$(function(){
	$("#datepicker").datepicker();
});

/*csTools Search*/
function searchCondition(){
	var selectedValue = $('input:radio[name=condition]:checked').val();
	var time = $('#datepicker').val();

	$.ajax({
		type:'GET',
		url:'/platform/csTools/getCondition',
		data:"selectedValue=" + selectedValue + "&time=" + time
	});
}








