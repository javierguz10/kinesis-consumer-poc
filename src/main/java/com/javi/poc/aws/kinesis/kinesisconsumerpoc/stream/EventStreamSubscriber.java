package com.javi.poc.aws.kinesis.kinesisconsumerpoc.stream;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EventStreamSubscriber {

    @StreamListener(Sink.INPUT)
    public void receive(String message) {
        log.info("Received message: {}", message);
    }
}
