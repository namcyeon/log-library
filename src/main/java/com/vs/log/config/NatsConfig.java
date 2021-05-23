package com.vs.log.config;

import io.quarkus.arc.config.ConfigProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@ConfigProperties(prefix = "nats")
public class NatsConfig {

    List<String> servers;

    Topic topic;

    @Getter
    @Setter
    public static class Topic {
        String log;
    }
}