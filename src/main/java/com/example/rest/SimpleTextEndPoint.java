package com.example.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.Date;

@Path("/text")
public class SimpleTextEndPoint {

    @GET
    @Produces("text/plain")
    public Response doGet() {
        return Response.ok("I'm a custom text" + new Date()).build();
    }
}
