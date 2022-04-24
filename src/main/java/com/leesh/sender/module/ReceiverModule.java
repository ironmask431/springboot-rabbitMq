package com.leesh.sender.module;

import com.leesh.sender.dto.DeptDto;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class ReceiverModule {

    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange(name="deptDto", type = ExchangeTypes.TOPIC), //sender 에서보낸 exchange 값
            value = @Queue(name="deptDto-4"),
            key = "deptDto-3" //receiver 에서 리턴한 key값
    ))
    public void receiver(DeptDto deptDto){
        System.out.println("<== 4.[수신]sender deptDto : "+ deptDto.toString());
    }
}
