package Entities;

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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userID;
    
    private String name;
    private String surname;
    private String password;
    private String userType;
    private String userName;
    private String emailAddress;
    
    @OneToMany( targetEntity=EarnedBadge.class )
    private List<EarnedBadge> earnedBadges;
    
    @OneToMany( targetEntity=UsedHints.class )
    private List<UsedHints> usedHints;
    
    public Users(){
        
        this.userName =null;
        this.emailAddress = null;
        this.earnedBadges = null;
        this.usedHints = null;
    }
    public Users(String name, String mEmailAddress){
        this.userName = name;
        this.emailAddress = mEmailAddress;
        this.earnedBadges = null;
        this.usedHints = null;
    }
    public Users(String name, String surname,String username,String password,String userType,String email)
    {
        this.name=name;
        this.surname=surname;
        this.userName=username;
        this.password=password;
        this.userType=userType;
        this.emailAddress=email;
        
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

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the userType
     */
    public String getUserType() {
        return userType;
    }

    /**
     * @param userType the userType to set
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * @return the userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }
}
