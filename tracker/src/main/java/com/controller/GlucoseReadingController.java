package com.controller;
import com.model.GlucoseReading;
import com.services.GlucoseReadingService;
import com.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/readings")
public class GlucoseReadingController {
    @Autowired
    static GlucoseReadingService glucoseReadingService;

    @Autowired
    static UserService userService;

    @PostMapping
    public String addReading(@ModelAttribute GlucoseReading reading) {
        glucoseReadingService.saveReading(reading, userService.getDefaultUser());
        return "redirect:/dashboard";
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public String deleteReading(@PathVariable Long id) {
        glucoseReadingService.deleteReading(id, userService.getDefaultUser());
        return "success";
    }
}