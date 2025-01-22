package org.acme.resource;

import java.util.Map;

import org.jboss.logging.Logger;

import io.quarkus.test.kafka.KafkaCompanionResource;

public class LoggingKafkaCompanionResource extends KafkaCompanionResource {
    Logger log = Logger.getLogger(LoggingKafkaCompanionResource.class);
    @Override
    public Map<String, String> start() {
        log.infof("*** companion test resource started");
        return super.start();
    }
    @Override
    public void stop() {
        log.infof("*** companion test resource stopped");
        super.stop();
    }

}