package com.ming.dubboconsumer;

import com.ming.dubboserver.interfaceService.HelloWorld;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerThd {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                new String[]{"applicationConsumer.xml"}
        );
        context.start();
        HelloWorld helloWorld=(HelloWorld)context.getBean("helloWorld");

        System.in.read();
    }
}
