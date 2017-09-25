package com.huang.controller;


import com.huang.common.Result;
import com.huang.entity.UserAccount;
import com.huang.service.UserAccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/userAccount")
public class UserAccountController {

    @Resource
    private UserAccountService userAccountService;

    @RequestMapping("/getUserAccount")
    @ResponseBody
    public Result<UserAccount> getUserAccount() {
        UserAccount userAccount=userAccountService.getUserAccount();
        return new Result<>(true,0,"",userAccount);
    }
}
