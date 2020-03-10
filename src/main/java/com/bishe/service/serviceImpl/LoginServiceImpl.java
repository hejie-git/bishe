package com.bishe.service.serviceImpl;

import com.bishe.bean.UserPo;
import com.bishe.dao.LoginDao;
import com.bishe.service.LoginServier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginServier {
    @Autowired
    private LoginDao loginDao;

    public UserPo getUserPo(String username) {
        return loginDao.getUserPo(username);
    }
}
