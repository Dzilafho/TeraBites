/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityManagers;

import Entities.Question;
import Entities.Challenge;
import Entities.Users;
import Entities.Level;
import java.util.List;

/**
 *
 * @author Gershom
 */
public interface GenericModelDAO<T> {
    public void add(T entityClass);
    public void update(T entityClass);
    public void delete(T entityClass);
        
    public Challenge getChallenge(String challengeName);
    public Users getUser(String userName);
    
    public List<Challenge> getAllChallenges();
    public List<Question> getAllQuestions();
    public List<Level> getAllLevels();
    public List<Users> getAllUsers();
   
    public void removeChallenge(String challengeName);
    public void removeQuestion(String challengeName, String levelName, int questionNo);
    public void removeLevel(String challengeName, String levelName);
    public void removeUser(String username);
    

}