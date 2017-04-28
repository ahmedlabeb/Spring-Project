/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineshop.hibernatemodel.daoInterface;

import com.onlineshop.hibernatemodel.pojo.Orders;
import com.onlineshop.hibernatemodel.pojo.Products;
import java.util.List;

/**
 *
 * @author Ahmed labib
 */
public interface OrderDaoInterface {
    //Start Dina
    public Orders updateOrderStatus(final String email,int status);
    public void removeOrder(Orders order);
    public Orders insertOrder(final String email,final List<Products> products);
    //End Dina
}
