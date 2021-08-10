package com.erayt.activemqcase.applicationEvent.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Auther: Z151
 * @Date: 2021/8/10 15:47
 */
public class EmailSendEvent extends ApplicationEvent {

    private String toEmail;
    public EmailSendEvent(Object source) {
        super(source);
        System.out.println("此处为 EmailSendEvent 的时间处理方法"+source);
        toEmail = (String) source;
    }

    public String getToEmail() {
        return toEmail;
    }
}
