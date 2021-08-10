package com.erayt.activemqcase.applicationEvent.listener;

import com.erayt.activemqcase.applicationEvent.event.Thread2Event;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Auther: Z151
 * @Date: 2021/8/10 15:51
 */
@Component
public class Thread2EventListener implements ApplicationListener<Thread2Event> {

    @Override
    public void onApplicationEvent(Thread2Event thread2Event) {
        System.out.println("此处为调用Thread2EventListener 的 onApplicationEvent，传入参数："+thread2Event);
        String name = thread2Event.getName();
        System.out.println("此处为调用Thread2EventListener 的 onApplicationEvent，获取名称为："+name);
    }

}
