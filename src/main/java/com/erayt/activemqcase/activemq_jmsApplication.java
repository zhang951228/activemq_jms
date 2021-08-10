package com.erayt.activemqcase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Auther: Z151
 * @Date: 2021/8/10 15:30
 */
@SpringBootApplication
public class activemq_jmsApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(activemq_jmsApplication.class, args);
    }
}
