package com.onlineshop.hibernatemodel.pojo;
// Generated Apr 28, 2017 6:19:27 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Products generated by hbm2java
 */
public class Products  implements java.io.Serializable {


     private Integer productId;
     private String productName;
     private double price;
     private int quantity;
     private String imageUrl;
     private String description;
     private Double discount;
     private String categoryName;
     private Set productreviewses = new HashSet(0);
     private Set productimageses = new HashSet(0);
     private Set orderdetailses = new HashSet(0);

    public Products() {
    }

	
    public Products(String productName, double price, int quantity, String imageUrl, String description, String categoryName) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.imageUrl = imageUrl;
        this.description = description;
        this.categoryName = categoryName;
    }
    public Products(String productName, double price, int quantity, String imageUrl, String description, Double discount, String categoryName, Set productreviewses, Set productimageses, Set orderdetailses) {
       this.productName = productName;
       this.price = price;
       this.quantity = quantity;
       this.imageUrl = imageUrl;
       this.description = description;
       this.discount = discount;
       this.categoryName = categoryName;
       this.productreviewses = productreviewses;
       this.productimageses = productimageses;
       this.orderdetailses = orderdetailses;
    }
   
    public Integer getProductId() {
        return this.productId;
    }
    
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }
    
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Double getDiscount() {
        return this.discount;
    }
    
    public void setDiscount(Double discount) {
        this.discount = discount;
    }
    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public Set getProductreviewses() {
        return this.productreviewses;
    }
    
    public void setProductreviewses(Set productreviewses) {
        this.productreviewses = productreviewses;
    }
    public Set getProductimageses() {
        return this.productimageses;
    }
    
    public void setProductimageses(Set productimageses) {
        this.productimageses = productimageses;
    }
    public Set getOrderdetailses() {
        return this.orderdetailses;
    }
    
    public void setOrderdetailses(Set orderdetailses) {
        this.orderdetailses = orderdetailses;
    }




}


