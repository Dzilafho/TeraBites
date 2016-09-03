/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuration;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author gershom
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(Services.AddChallenge.class);
        resources.add(Services.AddLevel.class);
        resources.add(Services.AddQuestion.class);
        resources.add(Services.AddUser.class);
        resources.add(Services.GetChallenges.class);
        resources.add(Services.GetLevels.class);
        resources.add(Services.GetQuestions.class);
        resources.add(Services.GetUsers.class);
        resources.add(Services.Login.class);
        resources.add(Services.Logout.class);
        resources.add(Services.RemoveChallenge.class);
        resources.add(Services.RemoveUser.class);
        resources.add(Services.Run.class);
    }
    
}
