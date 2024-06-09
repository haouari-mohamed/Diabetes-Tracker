package com.controller;

import com.entity.glycemie;
import com.service.DiabeteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.xml.xpath.XPath;
import java.util.List;
@Controller
@RequestMapping("/")
public class DiabeteController {

    @Autowired
    private DiabeteServiceImpl diabeteService;


    @GetMapping("/list")
    public String listDiabetes(Model model) {
        diabeteService.getDiabetes().forEach(System.out::println);
        List<glycemie> theDiabetes = diabeteService.getDiabetes();
        model.addAttribute("diabetes", theDiabetes);
        return "list-diabetes";
    }

    @GetMapping("/showForm")
    public String showDiabeteForm(Model model) {
        glycemie theDiabete = new glycemie();
        model.addAttribute("diabete", theDiabete);
        return "diabete-form";
    }

//@RequestMapping(path ="/", method =RequestMethod.GET)
    @PostMapping("/save")
    public String saveDiabete(@ModelAttribute("diabete") glycemie theDiabete) {
        diabeteService.saveDiabete(theDiabete);
        return "redirect:/list";
    }



    @GetMapping("/delete")
    public String deleteDiabete(@RequestParam("diabeteId") int theId) {
        diabeteService.deleteDiabete(theId);
        return "redirect:/list";
    }
}
