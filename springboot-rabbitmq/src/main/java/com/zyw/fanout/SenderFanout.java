package com.zyw.fanout;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: zyw9527
 * @version: v1.0  Created in 2019年05月22日  14:31 by zyw9527
 */
@Component
public class SenderFanout {

    @Autowired
    private AmqpTemplate template;

    public void send() {
        template.convertAndSend("fanoutExchange","","hello,rabbit-fanout~");
    }




}
