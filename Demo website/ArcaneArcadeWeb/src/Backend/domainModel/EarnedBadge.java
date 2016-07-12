package domainModel;

/**
 *
 * @author teraBites
 */
public class EarnedBadge {
    
    private String badgeName;
    
    public EarnedBadge()
    {
        this.badgeName = null;
    }
    public EarnedBadge(String mEarnedBadge)
    {
        this.badgeName = mEarnedBadge;
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
