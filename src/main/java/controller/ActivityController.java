package com.carbontracker.controller;

import com.carbontracker.entity.Activity;
import com.carbontracker.service.ActivityService;

public class ActivityController {

ActivityService service = new ActivityService();

public void addActivity(Activity activity) {

service.addActivity(activity);

}

}