package com.carbontracker.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.carbontracker.config.HibernateConfig;
import com.carbontracker.entity.CarbonRecord;

public class CarbonRecordRepository {

    public void saveRecord(CarbonRecord record) {

        Session session = null;
        Transaction transaction = null;

        try {
            session = HibernateConfig.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.persist(record);

            transaction.commit();
            System.out.println("Carbon record saved!");

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
}