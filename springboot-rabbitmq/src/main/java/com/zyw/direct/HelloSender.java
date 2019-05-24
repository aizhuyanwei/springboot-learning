package com.zyw.direct;

import com.zyw.model.UserVO;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 发送者
 *
 * @author: zyw9527
 * @version: v1.0  Created in 2019年05月22日  13:48 by zyw9527
 */
@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate template;

    public void send() {
        template.convertAndSend("queue","hello,rabbit~");
    }

 /*  发送对象
   public void send01() {
        UserVO userVO = new UserVO();
        userVO.setAddress("杭州市");
        userVO.setAge(25);
        userVO.setUsername("风清扬");
        template.convertAndSend("queue",userVO);
    }*/



}
