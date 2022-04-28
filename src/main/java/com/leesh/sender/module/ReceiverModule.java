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

    //receiver 서벌로부터 리턴받은 메세지 receiver
    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange(name="deptDto", type = ExchangeTypes.TOPIC), //sender 에서보낸 exchange 값
            value = @Queue(name="deptDto-4"), //현재 receiver의 value 임의 설정
            key = "deptDto-3" //receiver 에서 리턴한 key값
    ))
    public void receiver(DeptDto deptDto){
        System.out.println("<== 4.[수신]sender deptDto : "+ deptDto.toString());
    }
}
