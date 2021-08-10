package com.erayt.activemqcase.applicationEvent.listener;

import com.erayt.activemqcase.applicationEvent.event.Thread1Event;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Auther: Z151
 * @Date: 2021/8/10 15:51
 */
@Component
public class Thread1EventListener implements ApplicationListener<Thread1Event> {

    @Override
    public void onApplicationEvent(Thread1Event thread1Event) {
        System.out.println("此处为调用Thread1EventListener 的 onApplicationEvent，传入参数："+thread1Event);
        String name = thread1Event.getName();
        System.out.println("此处为调用Thread1EventListener 的 onApplicationEvent，获取名称为："+name);
    }
}
