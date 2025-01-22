package org.acme;

import jakarta.inject.Inject;

import org.acme.profile.SomeProfile;
import org.acme.resource.LoggingKafkaCompanionResource;
import org.acme.resource.SomeResource;
import org.jboss.logging.Logger;
import org.junit.jupiter.api.Test;

import io.quarkus.test.common.TestResourceScope;
import io.quarkus.test.common.WithTestResource;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;

@QuarkusTest
@WithTestResource(value = SomeResource.class) //, scope = TestResourceScope.GLOBAL)
//@TestProfile(SomeProfile.class)
public class _10_SomeResourceTest {
    @Inject Logger log;

    @Test
    void test() {
        log.infof("### running test");
    }

}
