package com.zyw.direct;

import com.zyw.model.UserVO;
import org.apache.catalina.User;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 接收者
 *
 * @author: zyw9527
 * @version: v1.0  Created in 2019年05月22日  13:50 by zyw9527
 */
@Component
public class HelloReceive {

    @RabbitListener(queues="queue")    //监听器监听指定的Queue
    public void processC(String str) {
        System.out.println("Receive:"+str);
    }

    /*@RabbitListener(queues="queue")    //监听器监听指定的Queue
    public void processC(UserVO user) {
        System.out.println("Receive:"+user);
    }
*/

}
