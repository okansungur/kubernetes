package com.example.kubedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KubedemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KubedemoApplication.class, args);
    }
    @RequestMapping("/")
    String index() {
        String str=(int)Math.floor(Math.random()*999999)+"";
        return "Hello Number: " +str;
    }

}
