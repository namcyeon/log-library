package com.vs.log.camel;
import com.vs.log.config.NatsConfig;
import org.apache.camel.component.nats.NatsComponent;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@ApplicationScoped
public class Configurations {

    @Inject
    NatsConfig natsConfig;

    @Named
    NatsComponent nats() {
        NatsComponent natsComponent = new NatsComponent();
        natsComponent.setServers(getServers());

        return natsComponent;
    }

    private String getServers() {
        StringBuilder sb = new StringBuilder();

        String prefix = "";
        for (String natsServer : natsConfig.getServers()) {
            sb.append(prefix);
            prefix = ",";
            sb.append(natsServer);
        }
        return sb.toString();
    }

}