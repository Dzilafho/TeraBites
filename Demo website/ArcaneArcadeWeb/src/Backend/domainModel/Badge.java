package domainModel;

/**
 *
 * @author teraBites
 */
public class Badge {
    
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
