/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.onlineshop.hibernatemodel.daoImp.UserDaoImp;
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
        UserDaoImp imp=(UserDaoImp) ctx.getBean("user");
        imp.insertUser(new User("shaaban@gmail.com", "male", "shibo", "ebrahim", "root", ""));
        System.out.println("inserted successfuly");
        //test shiboo
        
    }
}
