package com.edmunds.carl.controller;

import com.edmunds.carl.model.Activity;
import com.edmunds.carl.model.Exercise;
import com.edmunds.carl.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
 * Gets picked up as a controller due to it being tagged as so and
 * it residing within the controller package (which we are component
 * scanning on within the servlet-config.xml file)
 */

@Controller
public class MinutesController
{
    @Autowired
    private ExerciseService exerciseService;

    @RequestMapping(value = "/addMinutes")
    public String addMinutes(@ModelAttribute("exercise") Exercise exercise)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(exercise.getMinutes());
        sb.append(" minutes of ");
        sb.append(exercise.getActivity());
        sb.append(" logged.");
        System.out.println(sb.toString());

        return "addMinutes";
    }

    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    public @ResponseBody List<Activity> findAllActivities()
    {
        return exerciseService.findAllActivities();
    }
}
