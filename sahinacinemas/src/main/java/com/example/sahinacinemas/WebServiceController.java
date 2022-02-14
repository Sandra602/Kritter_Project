package com.example.sahinacinemas;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServiceController {
    @GetMapping("/rest")
    public String sayRest(){
        return "Great...!!!!";
    }
}

