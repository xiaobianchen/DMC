/*validate login form*/
function validate_loginForm(){
  	var username = $("input[name='username']").val();
  	var password = $("input[name='password']").val();

  	if(username == 'admin' && password=='123456'){
  		location.href="index.jsp";
  	}else{
  		alert("用户名密码不正确，请重新确认！");
  		$("input[name='password']").val("");
      $("input[name='password']").focus();
  		return false;
  	}
  }

/*validate register form*/
function validate_regForm(){
     var username = $("input[name='username']").val();
     var email = $("input[name='email']").val();
     var password = $("input[name='password1']").val();
     var repassword = $("input[name='repassword']").val();
     if(username == ''||username.length<6){
         alert('用户名不能为空且长度不能小于6');
         $("input[name='username']").focus();
         return false;
     }

     if(email == '' || !/.+@.+\.[a-zA-Z]{2,4}$/.test(email)){
          alert('请输入正确的邮箱地址');
          $("input[name='email']").focus();
          return false;
     }

     if(password == ''|| password.length==6){
          alert('密码不能为空且长度等于6');
          $("input[name='password1']").focus();
          return false;
     }

     // if(repassword==''||repassword.length==6){
     //      alert('确认密码不能为空且长度不能小于6');
     //      $("input[name='repassword']").focus();
     //      return false;
     // }

     // if(password != repassword){
     //      alert('密码与确认密码不一致, 请确认！');
     //      $("input[name='repassword']").focus();
     //      return false;
     // }

}

//ajax request
//function registerForm(){
//	$.ajax({
//		url:"/DMC_Web/register/",
//		type:"GET",
//	});
//}

$(document).ready(function(){
    $("#fxbtn").click(function(){
      var score = getRandom(100);
      $(".tijian-box").html(score);
    })
});

/* get random number*/
function getRandom(n){
  return Math.floor(Math.random()*n+1);
}

