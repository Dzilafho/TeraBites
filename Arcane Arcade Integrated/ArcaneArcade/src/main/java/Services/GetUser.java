
package Services;
import EntityManagers.ConcreteDAO;
import Entities.Users;
import java.util.*;

import javax.ws.rs.*;
import javax.ws.rs.core.*;


 
 
@Path("getuser")
public class GetUser {
    
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public  Response getUser(@Context UriInfo uriInfo,@FormParam("username") String username)
    {
        
        ConcreteDAO manager = new ConcreteDAO();
        
        Users result = manager.getUser(username);
      
         
        return Response.ok().entity(new GenericEntity<Users>(result){})
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Methods", "GET, POST, OPTIONS, HEAD")
        .build();
        
    }
                
} 