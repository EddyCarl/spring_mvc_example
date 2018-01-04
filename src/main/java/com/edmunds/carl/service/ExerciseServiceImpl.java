package com.edmunds.carl.service;

import com.edmunds.carl.model.Activity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService
{
    public List<Activity> findAllActivities()
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
