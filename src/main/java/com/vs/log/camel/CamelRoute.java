package com.vs.log.camel;

import com.vs.log.config.NatsConfig;
import org.apache.camel.builder.RouteBuilder;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CamelRoute extends RouteBuilder {

    @Inject
    NatsConfig natsConfig;

    @Override
    public void configure() {
        from("direct:sendLog")
                .to("nats:" + natsConfig.getTopic().getLog());
    }
}
