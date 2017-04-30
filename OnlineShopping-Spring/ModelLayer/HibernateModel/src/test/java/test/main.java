/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.onlineshop.hibernatemodel.daoImp.CardNumberDaoImp;
import com.onlineshop.hibernatemodel.daoImp.UserDaoImp;
import com.onlineshop.hibernatemodel.pojo.Rechargecards;
import com.onlineshop.hibernatemodel.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Ahmed labibtype
 */
public class main {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringConf.xml");
        //test shibo
     //   UserDaoImp imp=(UserDaoImp) ctx.getBean("user");
        
      // User user= imp.selectUser("shaaban@gmail.com", "root");
        //System.out.println(""+user.getGender());
      //  imp.insertUser(new User("shaaban@gmi.com", "male", "shibo", "ebrahim", "root", ""));
     //   System.out.println("inserted successfuly");
     //   for (User selectAllUser : imp.selectAllUsers()) {
           // System.out.println(""+selectAllUser.getEmail());
       // }
        //test shiboo
        
       
       // nesmaa
        CardNumberDaoImp obj =(CardNumberDaoImp) ctx.getBean("cardnumber");
        
           obj.insertCard(new Rechargecards(2, 10, "0"));
        //   System.out.println("insert");
        //obj.updateCardStatus(0, "1");
        //  Rechargecards findCardNumber = obj.findCardNumber(1);
        //  System.out.println(findCardNumber.getStatus());
        Rechargecards findCardNumber = obj.findCardNumber(0);
        System.out.println(findCardNumber.getValue());
      //  end nesma
        
     
        
    }
}
