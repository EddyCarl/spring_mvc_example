package com.edmunds.carl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoalController
{
    @RequestMapping(value = "/addGoal")
    public String addGoal()
    {
        return "addGoal";
    }
}
