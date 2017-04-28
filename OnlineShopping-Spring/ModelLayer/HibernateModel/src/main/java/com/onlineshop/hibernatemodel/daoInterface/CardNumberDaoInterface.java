/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineshop.hibernatemodel.daoInterface;

import com.onlineshop.hibernatemodel.pojo.Rechargecards;

/**
 *
 * @author Ahmed labib
 */
public interface CardNumberDaoInterface {
    // Nesmaa
    public Rechargecards findCardNumber(final int number);
    // must check if the card number is unique or not 
    public Rechargecards insertCard(Rechargecards rechargecards);
    public Rechargecards updateCardStatus(final int rechargeCardID,String status);
    public String findCardStatus(final int rechargeCardID);
    //Nesmaa
}
