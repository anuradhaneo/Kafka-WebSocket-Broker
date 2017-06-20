package com.codenate.messaging.kafka;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * Main class that is executed within the self staring server
 */
@SpringBootApplication
@Component
@EnableScheduling
public class KafkaWebsocketMain implements ApplicationListener<ApplicationReadyEvent> {

    private static Logger LOG = LoggerFactory.getLogger(KafkaWebsocketMain.class);

    public static void main(String[] args) {

        SpringApplication.run(KafkaWebsocketMain.class, args);

    }
	
	public void onApplicationEvent(ApplicationReadyEvent event) {
		;
	}

}
