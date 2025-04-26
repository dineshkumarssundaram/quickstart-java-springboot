package com.springboot_quickstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {

    @GetMapping(path="/hello")
    public String Hello(){
        return "Hello";
    }

    @GetMapping(path="/hello/world")
    public String World()
    {
        return  "World";
    }

    @GetMapping(path="/hello/world/helloworld")
    public String HelloWorld()
    {
        return "helloWorld";
    }

}
