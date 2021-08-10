package com.erayt.activemqcase.applicationEvent.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Auther: Z151
 * @Date: 2021/8/10 15:47
 */
public class Thread2Event extends ApplicationEvent {

    private String name;
    public Thread2Event(Object source) {
        super(source);
        System.out.println("此处为Thread2 的时间处理方法"+source);
        this.name = source.toString();
    }

    public String getName() {
        return name;
    }
}
