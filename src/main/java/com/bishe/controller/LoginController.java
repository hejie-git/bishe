package com.bishe.controller;

import com.bishe.bean.UserPo;
import com.bishe.bean.UserVo;
import com.bishe.service.LoginServier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/loginController")
public class LoginController {
    
@Autowired
private LoginServier loginServier;
    @RequestMapping("/login.do")
    public String login(UserVo userVo){
        UserPo userPo = loginServier.getUserPo(userVo.getUsername());
        if (null!=userPo){
            if (userPo.getPassword().equals(userVo.getPassword())){
                if ("A".equals(userPo.getFlage()))
                {
                    return "管理员权限！";
                }
                else if ("T".equals(userPo.getFlage())){
                    return "老师权限！";
                }else {
                    return "用户名或密码错误！";
                }
            }else {
                return "账户或密码输入错误！";
            }
        }else {
            return "此用户不存在！";
        }

    }
}
