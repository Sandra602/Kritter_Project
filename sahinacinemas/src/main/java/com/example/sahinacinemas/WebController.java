package com.example.sahinacinemas;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/hello")
    public String sayHello(Model model){
        System.out.println("llooooooooo");
        model.addAttribute("message","Greetings from Sandra Maria JOseph");
        return "hello";
    }
}
