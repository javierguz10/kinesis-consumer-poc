package com.javi.poc.aws.kinesis.kinesisconsumerpoc.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

import static org.springframework.cloud.stream.messaging.Source.OUTPUT;

public interface EventStream {
    @Input(Sink.INPUT)
    SubscribableChannel eventStream();
}