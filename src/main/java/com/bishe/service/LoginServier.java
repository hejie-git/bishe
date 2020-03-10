package com.bishe.service;

import com.bishe.bean.UserPo;
import com.bishe.bean.UserVo;
import org.springframework.stereotype.Service;

@Service
public interface LoginServier {

    public UserPo getUserPo(String username);
}
