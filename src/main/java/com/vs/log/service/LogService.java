package com.vs.log.service;
import com.google.gson.Gson;
import com.vs.log.model.LogModel;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.ProducerTemplate;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@Slf4j
@ApplicationScoped
public class LogService {
    @Inject
    ProducerTemplate template;

    public void sendLog(LogModel logModel) {
        template.asyncSendBody("direct:sendLog", new Gson().toJson(logModel));
        return;
    }

}