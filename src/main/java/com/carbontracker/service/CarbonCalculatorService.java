package com.carbontracker.service;

public class CarbonCalculatorService {

public double calculateTravelEmission(double distance) {

double emissionFactor = 0.21;

return distance * emissionFactor;

}

}