package com.carbontracker.service;

import com.carbontracker.entity.Activity;
import com.carbontracker.repository.ActivityRepository;

public class ActivityService {

    private ActivityRepository activityRepository = new ActivityRepository();
    private CarbonCalculatorService calculatorService = new CarbonCalculatorService();

    public void addActivity(Activity activity) {

        activityRepository.saveActivity(activity);

        calculatorService.calculateEmission(activity);

    }
}