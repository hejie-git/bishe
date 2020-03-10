package com.bishe.dao;

import com.bishe.bean.UserPo;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public interface LoginDao {
    public UserPo getUserPo(String usernam);
}
