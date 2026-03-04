package com.carbontracker.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.carbontracker.entity.User;
import com.carbontracker.entity.Activity;
import com.carbontracker.entity.CarbonRecord;

public class HibernateConfig {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {

        if(sessionFactory == null) {

            Configuration configuration = new Configuration();

            configuration.configure("hibernate.cfg.xml");

            configuration.addAnnotatedClass(User.class);
            configuration.addAnnotatedClass(Activity.class);
            configuration.addAnnotatedClass(CarbonRecord.class);

            sessionFactory = configuration.buildSessionFactory();
        }

        return sessionFactory;
    }
}