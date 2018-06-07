package com.example.rest.pet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/pet")
@Produces(MediaType.APPLICATION_JSON)
public class PetResource {

    @GET
    @Produces("text/plain")
    @Path("/test")
    public Response doGet() {
        return Response.ok("Hello from WildFly Swarm!").build();
    }

    @GET
    @Path("/{petId}")
    public Pet getPetById(@PathParam("petId") Long petId) {
        Pet pet = new Pet();
        pet.setId(10);
        pet.setName("Donald Duck");

        // return pet
        return pet;
    }
}
