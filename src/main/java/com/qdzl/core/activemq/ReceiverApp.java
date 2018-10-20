package com.qdzl.core.activemq;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReceiverApp {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("spring/spring-jms.xml");
    }
}
