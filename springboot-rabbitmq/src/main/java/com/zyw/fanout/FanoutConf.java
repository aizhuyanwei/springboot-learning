package com.zyw.fanout;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 广播模式
 *
 * @author: zyw9527
 * @version: v1.0  Created in 2019年05月22日  14:29 by zyw9527
 */
@Configuration
public class FanoutConf {

    @Configuration
    public class SenderConf {

        @Bean(name="Amessage")
        public Queue AMessage() {
            return new Queue("fanout.A");
        }


        @Bean(name="Bmessage")
        public Queue BMessage() {
            return new Queue("fanout.B");
        }

        @Bean(name="Cmessage")
        public Queue CMessage() {
            return new Queue("fanout.C");
        }

        @Bean
        FanoutExchange fanoutExchange() {
            return new FanoutExchange("fanoutExchange");//配置广播路由器
        }

        @Bean
        Binding
        bindingExchangeA(@Qualifier("Amessage") Queue AMessage, FanoutExchange fanoutExchange) {
            return BindingBuilder.bind(AMessage).to(fanoutExchange);
        }

        @Bean
        Binding bindingExchangeB(@Qualifier("Bmessage") Queue BMessage, FanoutExchange fanoutExchange) {
            return BindingBuilder.bind(BMessage).to(fanoutExchange);
        }

        @Bean
        Binding bindingExchangeC(@Qualifier("Cmessage") Queue CMessage, FanoutExchange fanoutExchange) {
            return BindingBuilder.bind(CMessage).to(fanoutExchange);
        }

    }
}
