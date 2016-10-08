 package Services;
import Entities.*;
import EntityManagers.ConcreteDAO;
import javax.ws.rs.core.Context;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;
 
@Path("removeChallenge")
public class RemoveChallenge {
    
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void removeChallenge(@Context @FormParam("challenge") String challengeName)
    {
          ConcreteDAO dao=new ConcreteDAO<>();
          dao.removeChallenge(challengeName);   
    }
    
} 