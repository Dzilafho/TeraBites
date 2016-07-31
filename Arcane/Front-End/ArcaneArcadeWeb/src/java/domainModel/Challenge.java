package domainModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
@XmlRootElement
public class Challenge implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ChallengeId;
   
    @OneToMany( targetEntity=Level.class )
    private List<Level> challengeLevels;
    
    private long timeTaken;

    /**
     * @return the challengeLevel
     */
    
    public Challenge()
    {
        this.challengeLevels = new ArrayList<Level>();
        timeTaken = 0;
    }
    public Challenge(int mTimeTaken,List<Level> mChallengeLevels)
    {
        this.challengeLevels = mChallengeLevels;
        timeTaken = mTimeTaken;
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
    
    public void removeChallengeLevel(Level challengeLevel) {
        this.challengeLevels.remove(challengeLevel);
    }
    
    public void removeChallengeLevel(int i) {
        this.challengeLevels.remove(i);
    }
    
    public Level getChallengeLevel(int i) {
        return this.challengeLevels.get(i);
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
    
}
