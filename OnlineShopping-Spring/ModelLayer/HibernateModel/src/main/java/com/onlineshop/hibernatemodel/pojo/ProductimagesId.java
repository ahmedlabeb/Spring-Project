package com.onlineshop.hibernatemodel.pojo;
// Generated Apr 27, 2017 8:07:42 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ProductimagesId generated by hbm2java
 */
@Embeddable
public class ProductimagesId  implements java.io.Serializable {


     private String imageUrl;
     private int productsProductId;

    public ProductimagesId() {
    }

    public ProductimagesId(String imageUrl, int productsProductId) {
       this.imageUrl = imageUrl;
       this.productsProductId = productsProductId;
    }
   


    @Column(name="imageUrl", nullable=false, length=800)
    public String getImageUrl() {
        return this.imageUrl;
    }
    
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    @Column(name="products_product_id", nullable=false)
    public int getProductsProductId() {
        return this.productsProductId;
    }
    
    public void setProductsProductId(int productsProductId) {
        this.productsProductId = productsProductId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ProductimagesId) ) return false;
		 ProductimagesId castOther = ( ProductimagesId ) other; 
         
		 return ( (this.getImageUrl()==castOther.getImageUrl()) || ( this.getImageUrl()!=null && castOther.getImageUrl()!=null && this.getImageUrl().equals(castOther.getImageUrl()) ) )
 && (this.getProductsProductId()==castOther.getProductsProductId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getImageUrl() == null ? 0 : this.getImageUrl().hashCode() );
         result = 37 * result + this.getProductsProductId();
         return result;
   }   


}


