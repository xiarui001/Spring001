package mq;

import org.apache.rocketmq.client.consumer.DefaultLitePullConsumer;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.*;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;

public class Consumer {
    public static void main(String[] args) throws  Exception{
        DefaultLitePullConsumer consumer1 = new DefaultLitePullConsumer("");

        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("");
        consumer.setNamesrvAddr("");
        consumer.subscribe("",":");
        consumer.registerMessageListener(new MessageListenerOrderly() {
            public ConsumeOrderlyStatus consumeMessage(List<MessageExt> msgs, ConsumeOrderlyContext context) {
                return null;
            }
        });
        consumer.start();
    }
}
