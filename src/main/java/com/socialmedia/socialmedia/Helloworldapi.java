package com.socialmedia.socialmedia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworldapi {
    @GetMapping("/helloworld")
    public String hello(){
        return "helloworld";}
    @GetMapping("/welcome")
    public String welcome(){
        return "welocme";
    }
   @PostMapping("/operation")
   @GetMapping("/operation")
    public int method(int a ,int b){
        return (a+b);
    }
}
