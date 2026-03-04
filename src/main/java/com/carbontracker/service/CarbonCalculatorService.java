package com.carbontracker.service;

import java.time.LocalDate;

import com.carbontracker.entity.Activity;
import com.carbontracker.entity.CarbonRecord;
import com.carbontracker.repository.CarbonRecordRepository;

public class CarbonCalculatorService {

    private CarbonRecordRepository recordRepository = new CarbonRecordRepository();

    public void calculateEmission(Activity activity) {

        double emissionFactor = 0;

        if(activity.getActivityType().equalsIgnoreCase("Transport")) {
            emissionFactor = 0.21;
        }
        else if(activity.getActivityType().equalsIgnoreCase("Bike")) {
            emissionFactor = 0.05;
        }
        else if(activity.getActivityType().equalsIgnoreCase("Flight")) {
            emissionFactor = 0.15;
        }

        double emission = activity.getValue() * emissionFactor;

        CarbonRecord record = new CarbonRecord();

        record.setUserId(activity.getUserId());
        record.setActivityId(activity.getId());
        record.setCo2Emission(emission);
        record.setCalculationDate(LocalDate.now());

        recordRepository.saveRecord(record);

        System.out.println("CO2 emission calculated: " + emission);
    }
}