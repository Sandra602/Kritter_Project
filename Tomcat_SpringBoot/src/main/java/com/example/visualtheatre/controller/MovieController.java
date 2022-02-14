package com.example.visualtheatre.controller;

import com.example.visualtheatre.domain.booking;
import com.example.visualtheatre.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MovieController {
    @Autowired
    private MovieService service;
    //private booking amount;
    //private Object RequestMethod;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<booking> liststudent = service.listAll();
        model.addAttribute("liststudent", liststudent);
        System.out.print("Get / ");
        return "index";
    }

    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("student", new booking());
        return "new";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute("student") booking std) {
        service.save(std);
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("new");
        booking std = service.get(id);
        mav.addObject("student", std);
        return mav;

    }
    @RequestMapping("/delete/{id}")
    public String deletestudent(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }
}
