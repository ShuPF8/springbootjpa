package com.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/6/14 0014.
 */
@RestController
public class test2 {
    @RequestMapping("/spf")
    String home() {
        return "SPF 大爷，你好！!";
    }
}
