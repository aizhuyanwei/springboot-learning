package com.zyw.topic;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * topic 消息接收者
 *
 * @author: zyw9527
 * @version: v1.0  Created in 2019年05月22日  14:11 by zyw9527
 */
@Component
public class ReceiverTopic {

    @RabbitListener(queues="topic.message")    //监听器监听指定的Queue
    public void process1(String str) {
        System.out.println("message:"+str);
    }
    @RabbitListener(queues="topic.messages")    //监听器监听指定的Queue
    public void process2(String str) {
        System.out.println("messages:"+str);
    }
}
