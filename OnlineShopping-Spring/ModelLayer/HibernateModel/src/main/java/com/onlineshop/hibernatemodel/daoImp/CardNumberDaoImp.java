/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineshop.hibernatemodel.daoImp;

import com.onlineshop.hibernatemodel.daoInterface.CardNumberDaoInterface;
import com.onlineshop.hibernatemodel.pojo.Rechargecards;
import javax.transaction.Transactional;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 *
 * @author Ahmed labib
 */
public class CardNumberDaoImp extends HibernateDaoSupport implements CardNumberDaoInterface {

    // Start Nesmaa
    @Override
    public Rechargecards findCardNumber(int number) {

        Rechargecards rechargedCard = (Rechargecards) getHibernateTemplate().get(Rechargecards.class, number);
        return rechargedCard;
    }

    @Transactional
    @Override
    public Rechargecards insertCard(Rechargecards rechargecards) {
        getHibernateTemplate().save(rechargecards);
        return rechargecards;
    }

    @Transactional
    @Override
    public Rechargecards updateCardStatus(int rechargeCardID, String status) {

        Rechargecards rechargedCard = (Rechargecards) getHibernateTemplate().get(Rechargecards.class, rechargeCardID);
        rechargedCard.setStatus(status);
        getHibernateTemplate().save(rechargedCard);
        return rechargedCard;
    }

    @Override
    public String findCardStatus(int rechargeCardID) {
        Rechargecards rechargedCard = (Rechargecards) getHibernateTemplate().get(Rechargecards.class, rechargeCardID);
        return rechargedCard.getStatus();
    }
    // End Nesmaa
}