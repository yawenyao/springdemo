package org.example;

import org.example.dao.Userdao;
import org.example.service.Userservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
        //Userservice userservice = new Userservice();
        //userservice.test();
        //得到应用的上下文环境
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        //得到对应的实例化对象
        Userservice userservice = (Userservice) ac.getBean("userservice");
        Userdao userdao = (Userdao) ac.getBean("userdao");
        //使用对象
        System.out.println("uersdervice"+userservice);
        userservice.test();
        userdao.test();

    }
}
