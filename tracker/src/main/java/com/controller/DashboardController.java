package com.controller;

import com.model.User;

import com.services.ChartService;
import com.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
    @Autowired
    private  UserService userService;

    @Autowired
    private ChartService chartService;



    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        User user = userService.getDefaultUser();
        model.addAttribute("user", user);
        model.addAttribute("chartData", chartService.getChartData(user));
        return "dashboard";
    }
}