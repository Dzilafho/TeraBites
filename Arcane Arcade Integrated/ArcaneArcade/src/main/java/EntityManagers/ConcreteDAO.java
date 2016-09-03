/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityManagers;

import Entities.*;
import java.rmi.activation.Activator;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PreDestroy;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.eclipse.persistence.config.PersistenceUnitProperties;

/**
 *
 * @author Gershom
 */
public class ConcreteDAO<T> implements GenericModelDAO<T> {
        
    private static final String PERSISTENCE_UNIT_NAME = "Mains";
    private static EntityManagerFactory factory;
    private static EntityManager em ;
    public ConcreteDAO()
    {
    
        factory = Persistence.createEntityManagerFactory("Mains");
        em = factory.createEntityManager();
    }

    @Override
    public void add(T entityClass) 
    {      
         em.getTransaction().begin(); 
         em.persist(entityClass);
         em.getTransaction().commit();
         em.close();
    }
    
    @Override
    public void update(T entityClass) {
         em.getTransaction().begin(); 
         em.persist(entityClass);
         em.getTransaction().commit();
         em.close();
    }

    @Override
    public void delete(T entityClass) {
        
         em.getTransaction().begin(); 
         em.remove(entityClass);
         em.getTransaction().commit();
         em.close();
       
    }

    @Override
    public List<Challenge> getAllChallenges()
    {
       
        em.getTransaction().begin(); 

        List<Challenge> list = em.createQuery("SELECT c FROM Challenge c", Challenge.class).getResultList();
 
        em.getTransaction().commit();
        em.close();
         
        return list; 
    }
    
    @Override
    public List<Level> getAllLevels()
    {
        em.getTransaction().begin(); 

        List<Level> list = em.createQuery("SELECT l FROM Level l", Level.class).getResultList();
       
        em.getTransaction().commit();
        em.close();
         
        return list; 
    }
    
   
    @Override
    public List<Question> getAllQuestions() {
       em.getTransaction().begin(); 

        List<Question> list = em.createQuery("SELECT q FROM Question q", Question.class).getResultList();
       
        em.getTransaction().commit();
        em.close();
         
        return list;
    }

    @Override
    public List<Users> getAllUsers() {
        
        em.getTransaction().begin(); 

       List<Users> list = em.createQuery("SELECT u  FROM Users u", Users.class).getResultList();
        em.getTransaction().commit();
        em.close();
         
        return list;
    }
    
    @Override
    public void removeChallenge(String challengeName)
    {
        em.getTransaction().begin(); 
        
        em.remove(this.getChallenge(challengeName));
        em.getTransaction().commit();
        em.close();
        
     }

    @Override
    public Users getUser(String userName) {
        em.getTransaction().begin(); 
        
        int userNum = 0;
        
        List<Users> list = em.createQuery("SELECT u FROM Users u", Users.class).getResultList();
        
        em.getTransaction().commit();
        
        for(int i = 0; i < list.size(); i++)
        {   
            if(userName.equals(list.get(i).getUserName()))
                     userNum = list.get(i).getUserID();
        }
        
        
        Users item = em.find(Users.class, userNum);
        //em.getTransaction().commit();
        //em.close();
         
        return item;  
    }
    
        @Override
    public Challenge getChallenge(String challengeName) {
        em.getTransaction().begin(); 
        
        int challengeNum = 0;
        
        List<Challenge> list = em.createQuery("SELECT c FROM Challenge c", Challenge.class).getResultList();
        
        em.getTransaction().commit();
        
        for(int i = 0; i < list.size(); i++)
        {   
            if(challengeName.equals(list.get(i).getChallengeName()))
                     challengeNum = list.get(i).getChallengeId();
        }
        
        

      
              
        Challenge item = em.find(Challenge.class, challengeNum);
      
        //em.getTransaction().commit();
        //em.close();
         
        return item;
    }

    @Override
    public void removeQuestion(String challengeName, String levelName, int questionNo){
        this.getChallenge(challengeName).getChallengeLevel(questionNo).removeQuestion(questionNo);    
        
         em.getTransaction().begin(); 
         em.persist(  this.getChallenge(challengeName));
         em.getTransaction().commit();
         em.close();
        
    }

    @Override
    public void removeLevel(String challengeName, String levelName) {
        this.getChallenge(challengeName).removeChallengeLevel(0);
         
         em.getTransaction().begin(); 
         em.persist(  this.getChallenge(challengeName));
         em.getTransaction().commit();
         em.close();
    }

    @Override
    public void removeUser(String username) {
        em.getTransaction().begin(); 
        
        em.remove(this.getUser(username));
                em.getTransaction().commit();
                        em.close();


    }

}
