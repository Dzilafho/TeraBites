package domainModel;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author teraBites
 */

@Entity
@XmlRootElement
public class Users implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;
    private String userName;
    private String emailAddress;
    
    @OneToMany( targetEntity=EarnedBadge.class )
    private List<EarnedBadge> earnedBadge;
    @OneToMany( targetEntity=UsedHints.class )
    private List<UsedHints> usedHints;
    
    public Users(){
        
        this.userName = "groetman";
        this.emailAddress = "chower";
        this.earnedBadge = null;
        this.usedHints = null;
    }
    public Users(String name, String mEmailAddress){
        this.userName = name;
        this.emailAddress = mEmailAddress;
        this.earnedBadge = null;
        this.usedHints = null;
    }
    
    /**
    * @return the userName
    */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * @return the earnedBadge
     */
    public EarnedBadge getEarnedBadge() {
        return null;
    }

    /**
     * @param earnedBadge the earnedBadge to set
     */
    public void setEarnedBadge(EarnedBadge earnedBadge) {
        //this.earnedBadge = earnedBadge;
    }

    /**
     * @return the usedHints
     */
    public UsedHints getUsedHints() {
        return null;
    }

    /**
     * @param usedHints the usedHints to set
     */
    public void setUsedHints(UsedHints usedHints) {
       // this.usedHints = usedHints;
    }
}
