package com.huang.service;

import com.huang.dao.mapper.UserAccountMapper;
import com.huang.entity.UserAccount;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserAccountService {

    @Resource
    private UserAccountMapper userAccountMapper;

    public UserAccount getUserAccount() {
        return userAccountMapper.getUserAccount();
    }
}
