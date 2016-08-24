/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domainModel;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

/**
 *
 * @author dZiLafho
 */
public class EntityManager 
{
     private static EntityManagerFactory factory;
     private static final String PERSISTENCE_UNIT_NAME = "Mains";
     private EntityManager em;
     
      public EntityManager()
      {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        em = (EntityManager) factory.createEntityManager();  
      }
      
      
      public void createUser()
      {
              
    
      }
      
      
      public void login()
      {
          
      }
      public void updateUser()
      {
           
      }
      public String getQuestionAnswer()
      {
          return null;
      }
      public void addQuestion()
      {
          
      }
      public void removeQuestion()
      {
          
          
      }
      
}
