package org.acme.resource;

import java.util.Map;

import org.jboss.logging.Logger;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;

public class SomeResource implements QuarkusTestResourceLifecycleManager {
    Logger log = Logger.getLogger(SomeResource.class);

    @Override
    public Map<String, String> start() {
        log.infof("*** test resource started");
        return Map.of();
    }

    @Override
    public void stop() {
        log.infof("*** test resource stopped");
    }

}
