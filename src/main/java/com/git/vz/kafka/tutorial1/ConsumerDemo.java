package com.git.vz.kafka.tutorial1;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.Properties;

public class ConsumerDemo {

    public static void main(String[] args) {

        Logger logger = new LoggerFactory.getLogger(ConsumerDemo.class.getName());
        String bootstrapServers = "127.0.0.1:9092";

        Properties properties = new Properties();

        properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());

    }
}
