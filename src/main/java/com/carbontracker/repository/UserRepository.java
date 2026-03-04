package com.carbontracker.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.carbontracker.config.HibernateConfig;
import com.carbontracker.entity.User;

public class UserRepository {

    public void saveUser(User user) {

        Session session = null;
        Transaction transaction = null;

        try {

            session = HibernateConfig.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.persist(user);

            transaction.commit();

            System.out.println("User saved successfully!");

        } catch (Exception e) {

            if (transaction != null) {
                transaction.rollback();
            }

            e.printStackTrace();

        } finally {

            if (session != null) {
                session.close();
            }
        }
    }


    // READ OPERATION
    public List<User> getAllUsers() {

        Session session = null;
        List<User> users = null;

        try {

            session = HibernateConfig.getSessionFactory().openSession();

            users = session.createQuery("FROM User", User.class).list();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (session != null) {
                session.close();
            }
        }

        return users;
    }

}