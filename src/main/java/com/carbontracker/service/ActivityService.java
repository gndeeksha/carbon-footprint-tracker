package com.carbontracker.service;

import com.carbontracker.entity.Activity;
import com.carbontracker.repository.ActivityRepository;

public class ActivityService {

    ActivityRepository repository = new ActivityRepository();

    public void addActivity(Activity activity) {

        repository.saveActivity(activity);

    }
}