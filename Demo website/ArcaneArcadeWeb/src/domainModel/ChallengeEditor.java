package com.bbd.arcane.domainModel;

import java.util.List;

/**
 *
 * @author teraBites
 */
public class ChallengeEditor {
    
    private List<Challenge> availableChallenges;
    /**
     * @return the availableChallenges
     */
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
