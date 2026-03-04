package com.carbontracker.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.carbontracker.entity.User;
import com.carbontracker.entity.Activity;
import com.carbontracker.entity.CarbonRecord;

public class HibernateConfig {

    private static SessionFactory sessionFactory;

    static {

        try {

            Configuration configuration = new Configuration();

            configuration.configure("hibernate.cfg.xml");

            configuration.addAnnotatedClass(User.class);
            configuration.addAnnotatedClass(Activity.class);
            configuration.addAnnotatedClass(CarbonRecord.class);

            sessionFactory = configuration.buildSessionFactory();

            System.out.println("Hibernate SessionFactory Created Successfully");

        } catch (Throwable ex) {

            System.err.println("SessionFactory creation failed.");
            throw new ExceptionInInitializerError(ex);

        }

    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}