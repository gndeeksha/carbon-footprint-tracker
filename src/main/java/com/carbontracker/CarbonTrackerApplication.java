package com.carbontracker;

import com.carbontracker.config.HibernateConfig;

public class CarbonTrackerApplication {

    public static void main(String[] args) {

        System.out.println("Carbon Footprint Tracker Application Started");

        // Initialize Hibernate (creates SessionFactory)
        try {
            HibernateConfig.getSessionFactory();
            System.out.println("Hibernate initialized successfully.");
        } catch (Exception e) {
            System.out.println("Error initializing Hibernate");
            e.printStackTrace();
        }

    }
}