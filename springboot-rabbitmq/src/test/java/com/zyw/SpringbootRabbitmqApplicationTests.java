package com.zyw;

import com.zyw.direct.HelloSender;
import com.zyw.fanout.SenderFanout;
import com.zyw.topic.SenderTopic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRabbitmqApplicationTests {

    @Autowired
    private HelloSender helloSender;

    @Autowired
    private SenderTopic senderTopic;

    @Autowired
    private SenderFanout senderFanout;
    /**
     * 测试direct exchange模式   点对点  队列完全匹配
     */
    @Test
    public void testDirect() {
        for (int i = 0; i < 10; i++) {
            helloSender.send();
        }

    }

    /**
     * 测试 topic exchange 广播模式  模糊匹配
     */
    @Test
    public void testTopic() {
        for (int i = 0; i < 10; i++) {
            senderTopic.send();
        }

    }

    /**
     * 测试 topic exchange 广播模式  模糊匹配
     */
    @Test
    public void testFanout() {
        senderFanout.send();

    }



}
