# springboot-rabbitMq-sender

목적 : 
1. springBoot와 RabbitMq 연동
2. RabbitMq를 통해 문자열과 객체 sender, receive 만들어보기

순서 : 
1. Local에 docker를 통해서 rabbitMQ 설치
2. 문자열 sender, receiver 개발, 테스트
3. 객체 sender, receiver 개발, 테스트 

메시지 흐름 : 
1. Sender 에서 Receiver로 메세지 전송  
2. Receiver 에서 메세지 수신
3. Receiver 에서 메시지 수신 후 Sender로 메세지 리턴 
4. Sender에서 리턴받은 메세지 수신 

![023](https://user-images.githubusercontent.com/48856906/165856446-36e40aaf-6776-4b49-8b2c-2fcaa67c6ed5.PNG)
