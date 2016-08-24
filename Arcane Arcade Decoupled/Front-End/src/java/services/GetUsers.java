 package services;
import EntityManagers.ConcreteDAO;
import domainModel.Users;
import java.util.*;

import javax.ws.rs.*;
import javax.ws.rs.core.*;


 
 
@Path("getUsers")
public class GetUsers {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public  Response getUsers()
            
    {
        ConcreteDAO manager = new ConcreteDAO();
        List<Users> result = manager.getAllUsers();
      
         
        return Response.ok().entity(new GenericEntity<List<Users>>(result){})
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Methods", "GET, POST, OPTIONS, HEAD")
        .build();
        
    }
                
} 