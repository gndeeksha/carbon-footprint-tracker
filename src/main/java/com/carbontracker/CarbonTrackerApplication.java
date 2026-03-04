package com.carbontracker;

import com.carbontracker.config.HibernateConfig;

public class CarbonTrackerApplication {

    public static void main(String[] args) {

        System.out.println("Carbon Footprint Tracker Started");

        try {
            HibernateConfig.getSessionFactory();
            System.out.println("Hibernate connected successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}