/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conf;

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
        resources.add(services.AddChallenge.class);
        resources.add(services.AddLevel.class);
        resources.add(services.AddQuestion.class);
        resources.add(services.AddUser.class);
        resources.add(services.GetChallenges.class);
        resources.add(services.GetLevels.class);
        resources.add(services.GetQuestions.class);
        resources.add(services.GetUsers.class);
        resources.add(services.Login.class);
        resources.add(services.Logout.class);
        resources.add(services.RemoveUser.class);
        resources.add(services.Run.class);
        resources.add(services.ViewLevel.class);
    }
    
}
