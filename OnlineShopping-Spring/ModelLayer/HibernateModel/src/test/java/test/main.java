/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Ahmed labib
 */
public class main {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringConf.xml");
        
    }
}
