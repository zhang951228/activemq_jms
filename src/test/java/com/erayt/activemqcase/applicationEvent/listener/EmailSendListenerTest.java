package com.erayt.activemqcase.applicationEvent.listener;

import com.erayt.activemqcase.applicationEvent.event.EmailSendEvent;
import com.erayt.activemqcase.applicationEvent.event.Thread1Event;
import com.erayt.activemqcase.applicationEvent.event.Thread2Event;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationEventPublisher;

/**
 * @Auther: Z151
 * @Date: 2021/8/10 15:57
 */
@SpringBootTest
public class EmailSendListenerTest {



    @Autowired
    private ApplicationEventPublisher eventPublisher;

    /**
     * 系统调用。
     */
    @Test
    public void test1(){
        eventPublisher.publishEvent(new EmailSendEvent("2927@qq.com"));
        eventPublisher.publishEvent(new Thread1Event("张三1"));
        eventPublisher.publishEvent(new Thread2Event("里斯2"));

    }

}