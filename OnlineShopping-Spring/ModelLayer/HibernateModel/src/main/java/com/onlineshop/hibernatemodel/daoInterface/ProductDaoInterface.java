/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineshop.hibernatemodel.daoInterface;

import com.onlineshop.hibernatemodel.pojo.Products;
import java.util.List;

/**
 *
 * @author Ahmed labib
 */
public interface ProductDaoInterface {
    //Start Labib
    public Products insertProduct(Products product);

    public Products updateProduct(Products newProduct);

    public Products updateProductQuantity(final int productID, int newQuantity);

    public List<Products> findProducts(final String productName, final String Category, final double price);
    
    public int findProductQuantity(final int productID);
    
    //needs paging
    public List<Products> findDiscountedProducts(); 
    // End Labib
    
    //Start Dina 
    //needs paging
    public List<Products> getAllProducts();
    // End Dina
    
    
}
