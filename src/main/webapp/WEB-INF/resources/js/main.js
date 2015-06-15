/*validate login form*/
function validate_loginForm(){
  	var username = $("input[name='username']").val();
  	var password = $("input[name='password']").val();
  	validate_user(username,password);
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
	    	location.href="/DMC/index";
	    	return true;
	}
}

/*check user and password*/
$(document).ready(function(){
	  $("input").blur(function(){
		  $("#checkUser").css('display','none');
		  $("#checkPwd").css('display','none');
		  $("#checkEmail").css('display','none');
		  $("#checkPwd").css('display','none');
		  $("#checkConfirmPwd").css('display','none');
		  $("#checkPwdAndConfirmPwd").css('display','none');
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
     var email = $("input[name='email']").val();
     var password = $("input[name='password1']").val();
     var repassword = $("input[name='repassword']").val();
     
     if(username == ''){
    	 $("#checkUser").css('display','block');
         $("input[name='username']").focus();
         return false;
     }else if(email == '' || !/.+@.+\.[a-zA-Z]{2,4}$/.test(email)){
          $("#checkEmail").css('display','block');
          $("input[name='email']").focus();
          return false;
     }else if(password == ''|| password.length==6){
          $("#checkPwd").css('display','block');
          $("input[name='password1']").focus();
          return false;
     }else if(repassword==''||repassword.length==6){
          $("#checkConfirmPwd").css('display','block');
          $("input[name='repassword']").focus();
          return false;
     }else if(password != repassword){
    	 $("#checkPwdAndConfirmPwd").css('display','block');
         $("input[name='repassword']").focus();
         return false;
     }else{
    	 location.href="/DMC/login";
     	return true;
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
    
/*message window*/
$(function(){
	$("#dialog" ).dialog({
	      autoOpen: false,
	      show: {
	        effect: "blind",
	        duration: 1000
	      },
	      hide: {
	        effect: "explode",
	        duration: 1000
	      }
	  });
	
	$("#opener").click(function(){
		$( "#dialog" ).dialog( "open" );
	});
});

/*datapicker*/
$(function(){
	$("#datapicker").datepicker();
});


	
	
