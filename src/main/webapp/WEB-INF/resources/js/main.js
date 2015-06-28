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
	    		url:"/DMC/login",
	    		data:"username=" + username + "&password=" + password,
	    		success:function(data){
	    			if(data=='success'){
	    				location.href="/DMC/index";
	    			}else{
	    				$("#existPwd").css('display','block');
	    				$("#password").focus();
	    				return false;
	    			}
	    		}
	    	});
	}
}

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
	});
});


/*remember password*/
$(document).ready(function(){
	if($.cookie("rmbUser") == "true"){
		$("#ck_rmbUser").attr("checked",true);
		$("#username").val($.cookie("username"));
		$("#password").val($.cookie("password"));
	}
});
 
/*validate register form*/
function validate_regForm(){
     var username = $("input[name='username']").val();
     var password = $("input[name='password1']").val();
     var repassword = $("input[name='repassword']").val();
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
     }else if(repassword==''){
          $("#checkConfirmPwd").css('display','block');
          $("input[name='repassword']").focus();
          return false;
     }else if(password != repassword){
    	 $("#checkPwdAndConfirmPwd").css('display','block');
         $("input[name='repassword']").focus();
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
    		 url:"/DMC/register",
    		 data:"username=" + username + "&password=" + password + "&repassword=" + repassword + "&email=" + email + "&phone=" + phone,
    		 success:function(data){
    			if(data == 'success'){
    				alert("用户注册成功!");
    				location.href='/DMC/login';
    			}else{
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
    
/*datapicker*/
$(function(){
	$("#datapicker").datepicker();
});

/*check user*/
function checkUser(){
	 var username = $("input[name='username']").val();
	  $.ajax({
			 type:"POST",
			 url:"/DMC/checkUser",
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
			url:"/DMC/checkEmail",
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
		url:"/DMC/checkPhone",
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
	}else if(contact==''){
		$("#info").css('display','block');
		$("#contactInfo").focus();
		return false;
	}
	
	$.ajax({
	    type:"POST",
	    url:"/DMC/feedback",
	    data:"comments=" + comments + "&type=" + type + "&contact=" + contact,
	    success:function(data){
	    	alert('您的建议我们已经收到,我们会尽快分析处理!');
	    	location.href='/DMC/index';
	    }
	});
}

/*popup*/
$(document).ready(function(){
	$("#imgsel").mouseover(function(){
		$(".popup").css('display','block');
	});
	
	$("#imgsel").mouseout(function(){
		$(".popup").css('display','none');
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
			url:'/DMC/resetPwd',
			data:"username=" + username + "&oldPassword=" + oldPassword +　"&password=" + password + "&confirmPassword=" + confirmPassword,
			success:function(data){
				alert(data);
			},
			error:function(data){
				$("#checkoldPassword").css('display','block');
				$("#oldpwd").focus();
				return false;
			}
		});
	}
}
/*DataTable*/
$(document).ready(function(){
	$("#listComments").DataTable();
});






















