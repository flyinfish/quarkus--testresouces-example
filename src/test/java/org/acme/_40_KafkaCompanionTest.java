package org.acme;

import jakarta.inject.Inject;

import org.acme.profile.KafkaProfile;
import org.acme.resource.LoggingKafkaCompanionResource;
import org.acme.resource.SomeResource;
import org.jboss.logging.Logger;
import org.junit.jupiter.api.Test;

import io.quarkus.test.common.TestResourceScope;
import io.quarkus.test.common.WithTestResource;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;
import io.quarkus.test.kafka.InjectKafkaCompanion;
import io.smallrye.reactive.messaging.kafka.companion.KafkaCompanion;

@QuarkusTest
@WithTestResource(value = LoggingKafkaCompanionResource.class) //, scope = TestResourceScope.GLOBAL)
//@TestProfile(KafkaProfile.class)
public class _40_KafkaCompanionTest {
    @Inject Logger log;

    @InjectKafkaCompanion
    KafkaCompanion kafkaCompanion;

    @Test
    void test() {
        log.infof("### running test with companion %s", kafkaCompanion);
    }

}
