package domainModel;

import java.io.Serializable;
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
public class ChallengeEditor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ChallengeEditorId;
    
    @OneToMany
    private List<Challenge> availableChallenges;
    /**
     * @return the availableChallenges
     */
    @XmlTransient
    public List<Challenge> getAvailableChallenges() {
        return availableChallenges;
    }
    
    public void addChallenge(Challenge inChallenge)
    {
        this.availableChallenges.add(inChallenge);
    }
    
    public void removeChallenge(Challenge inChallenge)
    {
        this.availableChallenges.remove(inChallenge);
    }
    
    public void removeChallenge(int i)
    {
        this.availableChallenges.remove(i);
    }
    
    public Challenge getChallenge(int i)
    {
        return this.getChallenge(i);
    }
    /**
     * @param availableChallenges the availableChallenges to set
     */
    public void setAvailableChallenges(List<Challenge> availableChallenges) {
        this.availableChallenges = availableChallenges;
    }
   
}
