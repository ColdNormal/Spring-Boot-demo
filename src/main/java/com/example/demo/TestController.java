/**
 * @Package com.example.demo
 * @author atom.hu
 * @date 2025/4/15 9:12
 * @version V1.0
 */
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
