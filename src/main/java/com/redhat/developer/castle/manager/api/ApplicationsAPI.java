package com.redhat.developer.castle.manager.api;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/applications")
public class ApplicationsAPI {
    @POST
    public Response create(){
        return Response.ok().build();
    }
}
