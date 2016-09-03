 package Services;
import Entities.*;
import EntityManagers.ConcreteDAO;
import javax.ws.rs.core.Context;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
@Path("removeUser")
public class RemoveUser {
    
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void removeUser(@Context @FormParam("challenge") String userName)
    {
          ConcreteDAO dao=new ConcreteDAO<>();
          dao.removeUser(userName);   
    }
    
} 