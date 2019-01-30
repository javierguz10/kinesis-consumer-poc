package com.javi.poc.aws.kinesis.kinesisconsumerpoc;

import com.javi.poc.aws.kinesis.kinesisconsumerpoc.stream.EventStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.autoconfigure.cache.ElastiCacheAutoConfiguration;
import org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfiguration;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(EventStream.class)
@EnableAutoConfiguration(exclude={ElastiCacheAutoConfiguration.class, ContextStackAutoConfiguration.class})
public class KinesisConsumerPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(KinesisConsumerPocApplication.class, args);
	}

}

