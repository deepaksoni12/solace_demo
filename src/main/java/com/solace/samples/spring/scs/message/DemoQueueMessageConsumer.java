package com.solace.samples.spring.scs.message;

import com.solace.samples.spring.scs.model.SensorReading;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

import javax.validation.Valid;


@Component
@EnableBinding(DemoQueueSink.class)
public class DemoQueueMessageConsumer {


    @StreamListener(DemoQueueSink.DEMO_QUEUE)
    public void handleMessage(@Valid SensorReading message) {
        //("Received message: {}", message);
    }

}
