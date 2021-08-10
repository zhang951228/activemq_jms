package com.erayt.activemqcase.activeMq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Controller;

import javax.jms.Queue;

/**
 * @Auther: Z151
 * @Date: 2021/8/10 14:19
 */

@Slf4j
@Controller
public class Producer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    public String sendMsg(String msg){
        System.out.println("发送消息"+msg);
        this.jmsMessagingTemplate.convertAndSend(this.queue,msg);
        System.out.println("发送消息完毕");
        return "";
    }

}
