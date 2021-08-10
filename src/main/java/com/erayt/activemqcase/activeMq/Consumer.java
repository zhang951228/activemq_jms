package com.erayt.activemqcase.activeMq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @Auther: Z151
 * @Date: 2021/8/10 14:19
 */

@Component
public class Consumer {

    @JmsListener(destination = "${activemq.queue}")
    public void receiveMsg(String text){
        System.out.println("接收到消息111 : "+text);
    }
}
