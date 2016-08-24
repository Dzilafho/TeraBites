/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.net.URI;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author gershom
 */
@Path("logout")
public class LogoutResource {

   
    /**
     * Creates a new instance of LoginResource
     */
    public LogoutResource() {
    }

    /**
     * Retrieves representation of an instance of services.LoginResource
     * @return an instance of java.lang.String
     */
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces("text/html")
    public Response LogoutValidation(@Context UriInfo uriInfo,@FormParam("username") String username) {
       
        
        
            URI uri=uriInfo.getBaseUriBuilder().path("../index.html").build();
            return Response.seeOther(uri).build();
            
        

     }
}
