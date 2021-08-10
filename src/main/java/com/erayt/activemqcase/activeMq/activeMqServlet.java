package com.erayt.activemqcase.activeMq;

import org.apache.activemq.broker.BrokerService;
import org.apache.activemq.broker.jmx.ManagementContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Auther: Z151
 * @Date: 2021/8/10 14:46
 */
@Component
public class activeMqServlet {
    @Value("${activemq.bindAddress}")
    private String bindAddress;

    @Value("${activemq.brokerName}")
    private String brokerName;

    //是否启用内嵌activemq
    //@Bean
    public BrokerService brokerService() throws Exception {
        BrokerService brokerService = new BrokerService();
        brokerService.setBrokerName(brokerName);
        brokerService.addConnector(bindAddress);
        brokerService.setManagementContext(new ManagementContext());
        brokerService.start();
        return brokerService;
    }
}
