package com.health;

import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.HealthCheckResponseBuilder;

import javax.enterprise.context.ApplicationScoped;

/**
 * @source https://www.youtube.com/watch?v=MT81YKLaGps
 */
@ApplicationScoped
@Health
public class HealthDemo implements HealthCheck {
    @Override
    public HealthCheckResponse call() {
        HealthCheckResponseBuilder alive = HealthCheckResponse.named("alive");
        alive.withData("hello", "world");

        return alive.build();
    }
}
