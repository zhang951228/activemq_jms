package com.erayt.activemqcase.activeMq;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

/**
 * @Auther: Z151
 * @Date: 2021/8/10 14:27
 */
@SpringBootTest
public class ProducerTest {

    @Autowired
    public Producer producer;

    @Test
    public void test1() throws IOException {
        producer.sendMsg("哈哈");

        //System.in.read();
    }
}