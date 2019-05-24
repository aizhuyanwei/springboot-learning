package com.zyw.direct;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Mq配置类  消息模式direct
 *
 * @author: zyw9527
 * @version: v1.0  Created in 2019年05月22日  13:39 by zyw9527
 */
@Configuration
public class SendConf {


    @Bean
    public Queue queue() {
        return new Queue("queue");
    }

}
