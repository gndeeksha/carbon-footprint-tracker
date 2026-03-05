package com.carbontracker;

import java.time.LocalDate;

import com.carbontracker.entity.Activity;
import com.carbontracker.entity.User;
import com.carbontracker.service.ActivityService;
import com.carbontracker.service.UserService;

public class CarbonTrackerApplication { //runs application and test backend functionality

    public static void main(String[] args) {

        // STEP 1: Create a new user
        UserService userService = new UserService();

        User user = new User();
        user.setName("Asher");
        user.setEmail("asher@email.com");
        user.setPassword("1234");
        user.setCountry("India");

        userService.registerUser(user);

        System.out.println("User created successfully");

        // STEP 2: Add activity for that user
        ActivityService activityService = new ActivityService();

        Activity activity = new Activity();
        activity.setUserId(1);   // user id from database
        activity.setActivityType("Transport");
        activity.setDescription("Car travel");
        activity.setValue(15);   // distance in km
        activity.setDate(LocalDate.now());

        activityService.addActivity(activity);

        System.out.println("Activity added and emission calculated");

    }
}