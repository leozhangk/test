package com.klook.test.demo.test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "com/klook/test/demo/test")
    public String test(){
        return "success";
    }


}
