package com.qdzl.core.activemq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

import com.qdzl.core.activemq.handle.MessageSender;

public class SenderApp {
    public static void main(String[] args) throws IOException {
        start("spring/spring-jms.xml");
    }

    public static void start(String configLocation) throws IOException {
        MessageSender sender = getMessageSender(configLocation);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入发送的消息:");
        String text = br.readLine();
        while (!StringUtils.isEmpty(text)) {
            System.out.println(String.format("发送消息: %s", text));
            sender.send(text);
            text = br.readLine();
        }
    }

    public static MessageSender getMessageSender(String configLocation) {
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
        return (MessageSender) context.getBean("messageSender");
    }
}
