/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineshop.hibernatemodel.daoInterface;

import com.onlineshop.hibernatemodel.pojo.User;
import java.util.List;

/**
 *
 * @author Ahmed labib
 */
public interface UserDaoInterface {
    // Start Dina
    public User insertUser(User user);

    public List<User> selectUsersWithOrders();
    //End Dina
    
    // Start Shaabaan
    public User selectUser(final String email, String password);

    public String findEmail(final String email);

    public User updateUser(User user);

    public double selectUserbalance(double balance);

    public User findUser(String email);
    // End Shaabaan

    // Nesmaa
    public List<User> selectAllUsers();
    //Nesmaa
}
