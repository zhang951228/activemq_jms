package com.erayt.activemqcase.configuration;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

/**
 * @Auther: Z151
 * @Date: 2021/8/10 14:04
 */

@Component
public class ActiveMqConfig {

    @Value("${spring.activemq.broker-url}")
    private String brokerUrl;

    @Value("${activemq.queue}")
    private String queueName;

    @Bean
    public ActiveMQConnectionFactory activeMQConnectionFactory(){
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(brokerUrl);
        return activeMQConnectionFactory;
    }

    @Bean
    public Queue queue(){
        return new ActiveMQQueue(queueName);
    }

}
