package Entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author teraBites
 */
@Entity
@XmlRootElement
public class Badge implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int BadgeId;
    
    private String badgeName;
    
    public Badge()
    {
        this.badgeName = null;
    }
    public Badge(String mBadgeName)
    {
       this.badgeName = mBadgeName;
    }

    /**
     * @return the badgeName
     */
    public String getBadgeName() {
        return badgeName;
    }

    /**
     * @param badgeName the badgeName to set
     */
    public void setBadgeName(String badgeName) {
        this.badgeName = badgeName;
    }
    
}
