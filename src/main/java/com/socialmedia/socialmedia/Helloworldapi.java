package com.socialmedia.socialmedia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworldapi {
    @GetMapping("/helloworld")
    public String hello(){
        return "helloworld";}
}
