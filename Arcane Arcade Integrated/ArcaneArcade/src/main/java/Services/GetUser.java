
package Services;
import EntityManagers.ConcreteDAO;
import Entities.Users;
import java.util.*;

import javax.ws.rs.*;
import javax.ws.rs.core.*;



@Path("getUser")
public class GetUser {
    
    @GET
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
   // public  Response getUser(@Context UriInfo uriInfo,@FormParam("username") String username)
       public  Response getUser()
 {
        
        ConcreteDAO manager = new ConcreteDAO();
        
        Users result = manager.getUser("gershom12");
      
         
        return Response.ok().entity(new GenericEntity<Users>(result){})
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Methods", "GET, POST, OPTIONS, HEAD")
        .build();
        
    }
                
} 