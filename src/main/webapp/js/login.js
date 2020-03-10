//按键盘回车键进行登录
function keyLogin() {
  if(event.keyCode === 13) {
    login();
  }//回车键的键值为13
}
const username = $('.text').val();
const password = $('.key').val();
//用户登录
function login() {
  const url = '/loginController/login.do';
  const parms = {'username': $('.text').val(), 'password': $('.key').val()};
  console.log(username );
  console.log(password );
  if (username == null || password == null) {
    alert("用户名或密码不能为空!")
  } else {
    $.ajax({
      "url":url,
      "data":parms,
      "type":"post",
      "success":function () {
        location.href="../result"
      },
      "error":function () {
        console.log("失败" )
      }
    })
  }

}

function User() {
  if (username.replace(/\s+/g, "").length === 0){
    $('.verifyUser').style.opacity = "1";
    $('.verifyUser').setAttribute("value","请输入用户名");
  }else {
    $('.verifyUser').style.opacity = "0";
  }
}

function Password() {
  if (password.replace(/\s+/g, "").length === 0){
    $('.verifyUser').style.opacity = "1";
    $('.verifyUser').setAttribute("value","请输入密码");
  }else {
    $('.verifyUser').style.opacity = "0";
  }
}