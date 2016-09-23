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
    
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
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
    public boolean checkUserExist(String username) //function not complete it only checks using the username when adding the user
    {
        if(getUser(username) != null)
        {
            return true;
        }
        else
        {
            return false;
        }
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
            {
                challengeNum = list.get(i).getChallengeId();
                            System.out.println("Found chal looping "+list.get(i).getChallengeName());

            }
        }
        
        

      
              
        Challenge item = em.find(Challenge.class, challengeNum);
      System.out.println("Found chal "+item.getChallengeName());
//       em.getTransaction().commit();
      //  em.close();
         
        return item;
    }

    
        
    @Override
    public void removeChallenge(String challengeName)
    {
        
        Challenge theChal = this.getChallenge(challengeName);
        

        
        if(theChal != null)
        {  

            em.getTransaction().begin(); 
            em.remove(theChal);
            em.getTransaction().commit();
            em.close();
        }
        
     }
    
    @Override
    public void removeQuestion(String challengeName, String levelName, int questionNo){
        
        List<Question> theQuestions = this.getChallenge(challengeName).getChallengeLevel(levelName).getQuestions();

        int questionID = theQuestions.get(questionNo-1).getQuestionID();
        
        this.getChallenge(challengeName).getChallengeLevel(levelName).removeQuestion(questionNo);

        
        em.getTransaction().begin(); 
               
        Question item = em.find(Question.class, questionID);
      
       
       // em.getTransaction().begin(); 
        em.remove(item);
        em.getTransaction().commit();
        
        
    }

    @Override
    public void removeLevel(String challengeName, String levelName) {
        
        em.getTransaction().begin(); 
        
        int levelID = 0;
        
        List<Level> list = em.createQuery("SELECT u FROM Level u", Level.class).getResultList();
        
        em.getTransaction().commit();
        
        for(int i = 0; i < list.size(); i++)
        {   
            if(levelName.equals(list.get(i).getLevelName()))
                     levelID = list.get(i).getLevelID();
        }
        
        em.getTransaction().begin(); 

        Level item = em.find(Level.class, levelID);
      

            em.remove(item);
            em.getTransaction().commit();
          //  em.close();
        
         
    }

    @Override
    public void removeUser(String username) 
    {
        
        Users theUser = this.getUser(username);
        

        
        if(theUser != null)
        {  

            em.getTransaction().begin(); 
            em.remove(theUser);
            em.getTransaction().commit();
            em.close();
        }

    }

}
