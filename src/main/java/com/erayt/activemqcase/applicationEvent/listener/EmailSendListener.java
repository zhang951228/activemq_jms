package com.erayt.activemqcase.applicationEvent.listener;

import com.erayt.activemqcase.applicationEvent.event.EmailSendEvent;
import com.erayt.activemqcase.applicationEvent.event.Thread2Event;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Auther: Z151
 * @Date: 2021/8/10 15:51
 */
@Component
public class EmailSendListener implements ApplicationListener<EmailSendEvent> {

    @Override
    public void onApplicationEvent(EmailSendEvent emailSendEvent) {
        System.out.println("此处为调用 EmailSendEvent 的 onApplicationEvent，传入参数："+emailSendEvent);
        String toEmail = emailSendEvent.getToEmail();
        System.out.println("此处为调用 EmailSendEvent 的 onApplicationEvent，获取名称为："+toEmail);
        System.out.println("开始发送邮件。");
    }

}
