package com.carbontracker.service;

public class CarbonCalculatorService {

    public double calculateEmission(double value) {

        double emissionFactor = 0.21;

        return value * emissionFactor;
    }
}