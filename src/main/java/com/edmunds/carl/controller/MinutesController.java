package com.edmunds.carl.controller;

import com.edmunds.carl.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Gets picked up as a controller due to it being tagged as so and
 * it residing within the controller package (which we are component
 * scanning on within the servlet-config.xml file)
 */

@Controller
public class MinutesController
{
    @RequestMapping(value = "/addMinutes")
    public String addMinutes(@ModelAttribute("exercise") Exercise exercise)
    {
        System.out.println("Printing exercise value: " + exercise.getMinutes());
        return "addMinutes";
    }
}
