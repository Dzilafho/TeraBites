package com.bbd.arcane.domainModel;

/**
 *
 * @author teraBites
 */
public class User
{
    private String userName;
    private String emailAddress;
    private EarnedBadge earnedBadge;
    private UsedHints usedHints;
    
    public User(){
        
        this.userName = null;
        this.emailAddress = null;
        this.earnedBadge = null;
        this.usedHints = null;
    }
    public User(String name, String mEmailAddress, EarnedBadge mEarnedBadge,UsedHints mUsedHints){
        this.userName = name;
        this.emailAddress = mEmailAddress;
        this.earnedBadge = mEarnedBadge;
        this.usedHints = mUsedHints;
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
        return earnedBadge;
    }

    /**
     * @param earnedBadge the earnedBadge to set
     */
    public void setEarnedBadge(EarnedBadge earnedBadge) {
        this.earnedBadge = earnedBadge;
    }

    /**
     * @return the usedHints
     */
    public UsedHints getUsedHints() {
        return usedHints;
    }

    /**
     * @param usedHints the usedHints to set
     */
    public void setUsedHints(UsedHints usedHints) {
        this.usedHints = usedHints;
    }
}
