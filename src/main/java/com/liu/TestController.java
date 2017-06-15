package com.liu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liujiawei on 2017/6/6.
 */
@RestController
public class TestController {
    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }

}
