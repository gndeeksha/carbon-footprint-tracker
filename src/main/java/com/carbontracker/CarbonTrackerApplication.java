package com.carbontracker;

import java.time.LocalDate;

import com.carbontracker.entity.Activity;
import com.carbontracker.service.ActivityService;

public class CarbonTrackerApplication {

    public static void main(String[] args) {

        ActivityService activityService = new ActivityService();

        Activity activity = new Activity();

        activity.setUserId(1);
        activity.setActivityType("Transport");
        activity.setDescription("Car travel");
        activity.setValue(15);
        activity.setDate(LocalDate.now());

        activityService.addActivity(activity);

    }
}