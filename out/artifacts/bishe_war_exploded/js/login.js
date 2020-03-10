//按键盘回车键进行登录
function keyLogin() {
    if(event.keyCode == 13) {
        console.log("回车")
    }//回车键的键值为13
        login();
}
//用户登录
function login() {
    var url = '/loginController/login.do'
    var parms = {'username':$('.text').val(),'password':$('.key').val()}
    var username = $('.text').val()
    console.log(username )
    var password = $('.key').val();
    console.log(password )
    if (username == null || password == null) {
        alert("用户名或密码不能为空!")
    } else {
        $.ajax({
            "url":url,
            "data":parms,
            "type":"post",
            "success":function () {
                console.log("成功")
            },
            "error":function () {
                console.log("失败" )
            }
        })
    }

}