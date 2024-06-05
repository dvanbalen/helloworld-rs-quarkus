package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class GreetingResource {

    @Inject
    GreetingService greetingService;

    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public String getHelloWorldJSON() {
        return "{\"result\":\"" + greetingService.createHelloMessage("World") + "\"}";
    }

    @GET
    @Path("/xml")
    @Produces(MediaType.APPLICATION_XML)
    public String getHelloWorldXML() {
        return "<xml><result>" + greetingService.createHelloMessage("World") + "</result></xml>";
    }
}
