/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Models.Client;
import Utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hp@Joel
 */
public class ClientDao {
    public void saveClient(Client c){
        Session sess = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sess.beginTransaction();
        sess.save(c);
        trans.commit();
        sess.close();
    }
    public void updateClient(Client c){
        Session sess = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sess.beginTransaction();
        sess.update(c);
        trans.commit();
        sess.close();
    }
    public void deleteClient(Client c){
        Session sess = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sess.beginTransaction();
        sess.delete(c);
        trans.commit();
        sess.close();
    }
    
}
