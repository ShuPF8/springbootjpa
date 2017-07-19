package com.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
@RestController
@Slf4j
public class Test1 {
    @RequestMapping("/now")
    public String hehe() {
        return "现在时间：" + (new Date()).toLocaleString();
    }
}
