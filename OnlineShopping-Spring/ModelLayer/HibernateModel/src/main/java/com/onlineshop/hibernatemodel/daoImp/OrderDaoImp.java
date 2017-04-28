/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineshop.hibernatemodel.daoImp;

import com.onlineshop.hibernatemodel.daoInterface.OrderDaoInterface;
import com.onlineshop.hibernatemodel.pojo.Orders;
import com.onlineshop.hibernatemodel.pojo.Products;
import java.util.List;

/**
 *
 * @author Ahmed labib
 */
public class OrderDaoImp implements OrderDaoInterface{

    @Override
    public Orders updateOrderStatus(String email, int status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeOrder(Orders order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Orders insertOrder(String email, List<Products> products) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
