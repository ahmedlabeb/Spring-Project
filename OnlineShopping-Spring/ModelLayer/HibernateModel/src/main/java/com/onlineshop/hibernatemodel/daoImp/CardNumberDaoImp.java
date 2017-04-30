/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineshop.hibernatemodel.daoImp;

import com.onlineshop.hibernatemodel.daoInterface.CardNumberDaoInterface;
import com.onlineshop.hibernatemodel.pojo.Rechargecards;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.orm.hibernate4.HibernateTemplate;

/**
 *
 * @author Ahmed labib
 */
public class CardNumberDaoImp implements CardNumberDaoInterface{
    // Start Nesmaa
   
    TransactionTemplate transactiontemplate;

    HibernateTemplate template;

    public TransactionTemplate getTransactiontemplate() {
        return transactiontemplate;
    }

    public void setTransactiontemplate(TransactionTemplate transactiontemplate) {
        this.transactiontemplate = transactiontemplate;
    }

    public HibernateTemplate getTemplate() {
        return template;
    }

    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }

    // Start Nesmaa
    @Override
    public Rechargecards findCardNumber(int number) {

        return (Rechargecards) transactiontemplate.execute(new TransactionCallback() {

            @Override
            public Rechargecards doInTransaction(TransactionStatus ts) {

                Rechargecards rechargedCard = (Rechargecards) template.get(Rechargecards.class, number);

                return rechargedCard;

            }

        });

    }

    @Override
    public Rechargecards insertCard(Rechargecards rechargecards) {

        return (Rechargecards) transactiontemplate.execute(new TransactionCallback() {

            @Override
            public Rechargecards doInTransaction(TransactionStatus ts) {

                template.save(rechargecards);

                return rechargecards;

            }

        });

    }

    @Override
    public Rechargecards updateCardStatus(int rechargeCardID, String status) {

        return (Rechargecards) transactiontemplate.execute(new TransactionCallback() {

            @Override
            public Rechargecards doInTransaction(TransactionStatus ts) {

                Rechargecards rechargedCard = (Rechargecards) template.get(Rechargecards.class, rechargeCardID);
                rechargedCard.setStatus(status);
                template.save(rechargedCard);

                return rechargedCard;

            }

        });

    }

    @Override
    public String findCardStatus(int rechargeCardID) {

        return (String) transactiontemplate.execute(new TransactionCallback() {

            @Override
            public String doInTransaction(TransactionStatus ts) {

                Rechargecards rechargedCard = (Rechargecards) template.get(Rechargecards.class, rechargeCardID);

                return rechargedCard.getStatus();

            }

        });

    }
    // End Nesmaa
}
