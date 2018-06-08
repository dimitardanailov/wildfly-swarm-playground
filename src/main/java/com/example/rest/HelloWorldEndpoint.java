package com.example.rest;

import org.eclipse.microprofile.metrics.Counter;
import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.metrics.annotation.Metric;
import org.eclipse.microprofile.metrics.annotation.Timed;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@RequestScoped
@Path("/hello")
public class HelloWorldEndpoint {

    @Inject
    String what;

    @Inject
    @Metric(absolute = true, description = "How often are calls to /health tired")
    Counter counter;

    @GET
    @Produces("text/plain")
    @Counted(description = "Counting of the Hello call",
            absolute = true,
            tags = {"app=shop", "type=counter"},
            monotonic = true)
    @Timed
    public Response doGet() {
        return Response.ok(what + " from WildFly Swarm!").build();
    }
}