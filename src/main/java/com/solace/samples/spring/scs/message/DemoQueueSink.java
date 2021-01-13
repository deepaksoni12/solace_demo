package com.solace.samples.spring.scs.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface DemoQueueSink {

    String DEMO_QUEUE = "demo-queue";

    @Input(DEMO_QUEUE)
    SubscribableChannel demoQueueInput();

}
