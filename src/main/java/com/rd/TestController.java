package com.rd;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/include")
public class TestController {

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String test1() {
        return "TEST1";
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public String test2() {
        return "TEST2";
    }

}
