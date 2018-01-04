package com.edmunds.carl.controller;

import com.edmunds.carl.model.Goal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoalController
{
    @RequestMapping(value = "/addGoal")
    public String addGoal(Model model)
    {
        model.addAttribute("goal", new Goal());
        return "addGoal";
    }
}
