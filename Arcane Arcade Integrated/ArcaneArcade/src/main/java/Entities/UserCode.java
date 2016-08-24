package Entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author teraBites
 */
@Entity
@XmlRootElement
public class UserCode implements Serializable {
    
    @Id
    private int userCodeID;
    private String userInput;

    /**
     * @return the userInput
     */
    public UserCode()
    {
        userInput = "";
    }
    
    public UserCode(String userInput)
    {
        this.userInput = userInput;
    }
    
    public String getUserInput() {
        return userInput;
    }

    /**
     * @param userInput the userInput to set
     */
    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    /**
     * @return the userCodeID
     */
    public int getUserCodeID() {
        return userCodeID;
    }

    /**
     * @param userCodeID the userCodeID to set
     */
    public void setUserCodeID(int userCodeID) {
        this.userCodeID = userCodeID;
    }
}
