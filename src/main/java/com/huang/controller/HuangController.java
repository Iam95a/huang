package com.huang.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/huang")
public class HuangController {
    private static Logger Log = LoggerFactory.getLogger(HuangController.class);

    @RequestMapping("/getHuang")
    @ResponseBody
    public String getHuang() {
        return "huang";
    }


}
