package mq;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.MessageQueueSelector;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageQueue;

import java.util.List;

public class Producer {
    public static void main(String[] args) throws  Exception{
        DefaultMQProducer producer = new DefaultMQProducer("");
        producer.setNamesrvAddr("");
        producer.setSendMsgTimeout(100);
        producer.start();

        Message message = new Message("topicA", "tagA", "消息body".getBytes());
        int orderid=0;

        
        producer.send(message, new MessageQueueSelector() {
            public MessageQueue select(List<MessageQueue> list, Message message, Object o) {
                Integer id = (Integer) o;
                return list.get(id%list.size());
            }
        },orderid);

    }
}
