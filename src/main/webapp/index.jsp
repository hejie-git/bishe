<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>天津科技大学排课系统</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <meta name="keywords" content="Flat Dark Web Login Form Responsive Templates, Iphone Widget Template, Smartphone login forms,Login form, Widget Template, Responsive Templates, a Ipad 404 Templates, Flat Responsive Templates" />
    <link href="css/style.css" rel='stylesheet' type='text/css' />
    <!--webfonts-->
    <link href='http://fonts.useso.com/css?family=PT+Sans:400,700,400italic,700italic|Oswald:400,300,700' rel='stylesheet' type='text/css'>
    <link href='http://fonts.useso.com/css?family=Exo+2' rel='stylesheet' type='text/css'>
    <!--//webfonts-->
    <script src="js/jquery-3.4.1.min.js"></script>
    <script src="js/login.js"/>
</head>
<body>
<script>$(document).ready(function(c) {
    $('.close').on('click', function(c){
        $('.login-form').fadeOut('slow', function(c){
            $('.login-form').remove();
        });
    });
});
</script>
<!--SIGN UP-->
<h1>天津科技大学排课系统</h1>
<div class="login-form">
    <div class="head-info">
        <label class="lbl-1"> </label>
        <label class="lbl-2"> </label>
        <label class="lbl-3"> </label>
    </div>
    <div class="clear"> </div>
    <div class="avtar">
        <img src="images/avtar.png" />
    </div>
    <form id="loginFrom" name="loginFrom" method="post">
        <input type="text" class="text" value="请输入学号/工号" onfocus="this.value = '';" onblur="User()"><span class="verifyUser" style="opacity: 0"></span>
        <div class="key">
            <input type="password" value="请输入密码" onfocus="this.value = '';" onblur="Password()"><span class="verifyPass" style="opacity: 0"></span>
        </div>
    </form>
    <div class="signin">
        <input type="submit" value="Login" onclick="login()" >
    </div>
</div>
</body>
</html>
