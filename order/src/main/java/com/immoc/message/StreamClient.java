package com.immoc.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface StreamClient {
    String INPUT1 = "myMessage";
    String OUTPUT1 = "myMessage2";

    String INPUT2 = "myMessage3";
    String OUTPUT2 = "myMessage4";


    @Input(StreamClient.INPUT1)
    SubscribableChannel input1();

    @Output(StreamClient.OUTPUT1)
    MessageChannel output1();

    @Input(StreamClient.INPUT2)
    SubscribableChannel input2();

    @Output(StreamClient.OUTPUT2)
    MessageChannel output2();
}
