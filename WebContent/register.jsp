<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
    <meta name="author" content="GeeksLabs">
    <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
    <link rel="shortcut icon" href="img/favicon.png">

    <title>Login Page 2 | Creative - Bootstrap 3 Responsive Admin Template</title>

    <!-- Bootstrap CSS -->    
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="css/bootstrap-theme.css" rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href="css/elegant-icons-style.css" rel="stylesheet" />
    <link href="css/font-awesome.css" rel="stylesheet" />
    <!-- Custom styles -->
    <link href="css/style.css" rel="stylesheet">
    <link href="css/style-responsive.css" rel="stylesheet" />

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 -->
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
    <script type="text/javascript">
				
				
					
				function valEname(){
					if (f.ename.value==""){
						document.getElementById("span1").innerHTML="不允许为空";
						return false;
					}else{
						return true;
					}
				}
				//验证密码
				function valPassword(){
					if(f.password.value.length<6){
						document.getElementById("span2").innerHTML="应大于6位";
						return false;
					}else{
						return true;
					}
				}
				
				function valEtel(){
					var p = /^\d{11}$/;
					
					//if (f.s_telno.value.search("/^\d{11}$/"==-1)){
				   if(!p.test(f.etel.value)){
					   document.getElementById("span3").innerHTML="请输入11位数字";
						return false;
					}else{
					 return true;
					}
				}
				
					
					
					
				function checkPassword(){
					if(f.password.value!=f.password1.value)
					{
						 document.getElementById("span4").innerHTML="两次输入密码不同";
						return false;
					}else{
						return true;
					}
					
				}
				</script>
</head>

  <body class="login-img3-body">

    <div class="container">

      <form class="login-form" name="f" id="f" >        
        <div class="login-wrap">
            <p class="login-img"><i class="icon_lock_alt"></i></p>
            <div class="input-group">
              <span class="input-group-addon"><i class="icon_profile"></i></span>
              <input type="text" class="form-control"  name="ename" id= "ename" onblur="valEname()" placeholder="请输入用户名">
              <span id="span1" ></span>
            </div>
            <div class="input-group">
                <span class="input-group-addon"><i class="icon_key_alt"></i></span>
                <input type="text" class="form-control" placeholder="请输入电话号码" name="etel" id="etel" onblur="valEtel()">
                <span id="span3" ></span>
            </div>
            <div class="input-group">
                <span class="input-group-addon"><i class="icon_key_alt"></i></span>
                <input type="password" class="form-control"  name="password" id="password" onblur="valPassword()" placeholder="请设置密码">
                <span id="span2" ></span>
            </div>
            <div class="input-group">
                <span class="input-group-addon"><i class="icon_key_alt"></i></span>
                <input type="password" class="form-control" placeholder="请确认密码" name="password1" id="password1" onblur="checkPassword()">
                 <span id="span4" ></span>
            </div>
            
          
            <button class="btn btn-primary btn-lg btn-block" type="submit" onclick="if(valEname()&&valPassword()&&checkPassword()&&valEtel()){f.action='${pageContext.request.contextPath }/login'; f.submit();}" >注册</button>
            
        </div>
      </form>

    </div>


  </body>
</html>
