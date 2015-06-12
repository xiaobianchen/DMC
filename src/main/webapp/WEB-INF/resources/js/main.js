/*validate login form*/
function validate_loginForm(){
  	var username = $("input[name='username']").val();
  	var password = $("input[name='password']").val();

    if(username==''){
    	$("input[name='username']").focus();
    	$("#checkUser").css('display','block');
    	return false;
    }else if(password==''){
    	$("input[name='password']").focus();
    	$("#checkPwd").css('display','block');
    	return false;
    }else{
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

$(function() {
    $( "#dialog-confirm" ).dialog({
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
 
    $( "#icon-message" ).click(function() {
      $( "#dialog-confirm" ).dialog( "open" );
    });
});
	
	
