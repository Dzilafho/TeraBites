package Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author teraBites
 */

@Entity
public class Challenge implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ChallengeId;
   
    @OneToMany( targetEntity=Level.class, cascade = CascadeType.ALL)
    private List<Level> challengeLevels;
    
    private String challengeName;
    
    private long timeTaken;

    /**
     * @return the challengeLevel
     */
    
    public Challenge()
    {
        this.challengeLevels = new ArrayList<Level>();
        this.timeTaken = 0;
        this.challengeName=null;
    }
    public Challenge(String challengeName)
    {
        this.challengeName=challengeName;
       challengeLevels = new ArrayList<Level>();
    }
    public Challenge(int mTimeTaken,Level level,String challName)
    {
        this.challengeLevels.add (level);
        this.timeTaken = mTimeTaken;
        this.challengeName=challName;
        
    }
   
    @XmlTransient
    public List<Level> getChallengeLevels() {
        return challengeLevels;
    }

    /**
     * @param challengeLevel the challengeLevel to set
     */
    public void setChallengeLevels(List<Level> challengeLevel) {
        this.challengeLevels = challengeLevel;
    }
   
    public void addChallengeLevel(Level challengeLevel) {
        this.challengeLevels.add(challengeLevel);
    }
    
    
    public void addQuestion(String challengeLevel, Question queObject) {
        
        for(int i = 0; i< this.challengeLevels.size(); i++)
        {
            
            if(this.challengeLevels.get(i).getLevelName().equals(challengeLevel))
            {
                this.challengeLevels.get(i).addQuestion(queObject);
            }
            else
                 System.out.println("Not this one");
        }
    }
    
    public void removeChallengeLevel(Level challengeLevel) {
        this.challengeLevels.remove(challengeLevel);
    }
    
    public void removeChallengeLevel(String levelName) {
        
        for(int i = 0; i< this.challengeLevels.size(); i++)
        {
            
            if(this.challengeLevels.get(i).getLevelName().equals(levelName))
            {
                this.challengeLevels.remove(i);
            }
        }
    }
    
    public Level getChallengeLevel(int i) {
        return this.challengeLevels.get(i);
    }
    
    public Level getChallengeLevel(String levelName) {
        
        for(int i = 0; i< this.challengeLevels.size(); i++)
        {
            
            if(this.challengeLevels.get(i).getLevelName().equals(levelName))
            {
                return this.challengeLevels.get(i);
            }
      
        }
        
       return null;

    }
    /**
     * @return the timeTaken
     */
    public long getTimeTaken() {
        return timeTaken;
    }

    /**
     * @param timeTaken the timeTaken to set
     */
    public void setTimeTaken(long timeTaken) {
        this.timeTaken = timeTaken;
    }

    /**
     * @return the challengeName
     */
    public String getChallengeName() {
        return challengeName;
    }

    /**
     * @param challengeName the challengeName to set
     */
    public void setChallengeName(String challengeName) {
        this.challengeName = challengeName;
    }

    /**
     * @return the ChallengeId
     */
    public int getChallengeId() {
        return ChallengeId;
    }

    /**
     * @param ChallengeId the ChallengeId to set
     */
    public void setChallengeId(int ChallengeId) {
        this.ChallengeId = ChallengeId;
    }
    
}
