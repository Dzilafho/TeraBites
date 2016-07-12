package com.bbd.arcane.domainModel;

/**
 *
 * @author teraBites
 */
public class UserCode {
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
}
