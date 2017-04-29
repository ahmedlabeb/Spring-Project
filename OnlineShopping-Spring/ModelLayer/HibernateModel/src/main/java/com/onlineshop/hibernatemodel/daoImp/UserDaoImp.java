/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineshop.hibernatemodel.daoImp;

import com.onlineshop.hibernatemodel.daoInterface.UserDaoInterface;
import com.onlineshop.hibernatemodel.pojo.User;
import java.util.List;
import org.hibernate.Query;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

/**
 *
 * @author Ahmed labib
 */
public class UserDaoImp implements UserDaoInterface {

    HibernateTemplate hibernate;
    TransactionTemplate transaction;

    public HibernateTemplate getHibernate() {
        return hibernate;
    }

    public void setHibernate(HibernateTemplate hibernate) {
        this.hibernate = hibernate;
    }

    public TransactionTemplate getTransaction() {
        return transaction;
    }

    public void setTransaction(TransactionTemplate transaction) {
        this.transaction = transaction;
    }

    @Override
    public User insertUser(User user) {
        //start
        transaction.execute(new TransactionCallback<User>() {
            @Override
            public User doInTransaction(TransactionStatus ts) {
                hibernate.persist(user);
                return user;
            }
        });

        return user;
        //end
    }

    @Override
    public User selectUser(String email, String password) {
        //start
        String sql = "from User   p where p.email=:email and p.password=:password ";
        Query query = hibernate.getSessionFactory().openSession().createQuery(sql);
        query.setParameter("email", email);
        query.setParameter("password", password);

        return (User) query.list().get(0);

    }

    //shibooooo
    @Override
    public String findEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User updateUser(User user) {
        //start
        transaction.execute(new TransactionCallback<User>() {
            @Override
            public User doInTransaction(TransactionStatus ts) {
                hibernate.update(user);
                return user;
            }
        });

        return user;

        //end
    }

    @Override
    public double selectUserbalance(double balance) {
//         String sql = "p.balance from User p where p.email=:email ";
//        Query query = hibernate.getSessionFactory().openSession().createQuery(sql);
//        query.setParameter("email", "shaaban@gmail.com");
//       User user= (User)query.list().get(0);
//        return user.getBa
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public List<User> selectUsersWithOrders() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User findUser(String email) {

        String sql = "from User   p where p.email=:email";
        Query query = hibernate.getSessionFactory().openSession().createQuery(sql);
        query.setParameter("email", email);

        return (User) query.list().get(0);

    }

    // Start Nesmaa
    @Override
    public List<User> selectAllUsers() {
        String sql = "from User p ";
        Query query = hibernate.getSessionFactory().openSession().createQuery(sql);

        return query.list();

    }
    // End Nesmaa
}
