package com.edmunds.carl.controller;

import com.edmunds.carl.model.Activity;
import com.edmunds.carl.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    public @ResponseBody List<Activity> findAllActivities()
    {
        List<Activity> activities = new ArrayList<Activity>();

        Activity run = new Activity();
        run.setDescription("Run");
        activities.add(run);

        Activity walk = new Activity();
        walk.setDescription("Walk");
        activities.add(walk);

        Activity cycle = new Activity();
        cycle.setDescription("Cycle");
        activities.add(cycle);

        Activity swim = new Activity();
        swim.setDescription("Swim");
        activities.add(swim);

        return activities;
    }
}
