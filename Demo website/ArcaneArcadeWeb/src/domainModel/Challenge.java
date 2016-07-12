package com.bbd.arcane.domainModel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author teraBites
 */
public class Challenge {
   
    private List<Level> challengeLevels;
    private long timeTaken;

    /**
     * @return the challengeLevel
     */
    
    Challenge()
    {
        this.challengeLevels = new ArrayList<Level>();
        timeTaken = 0;
    }
    
    public List<Level> getChallengeLevels() {
        return challengeLevels;
    }

    /**
     * @param challengeLevel the challengeLevel to set
     */
    public void setChallengeLevels(List<Level> challengeLevel) {
        this.challengeLevels = challengeLevel;
    }
   
    public void addChallengeLevel(Level challengeLevel) {
        this.challengeLevels.add(challengeLevel);
    }
    
    public void removeChallengeLevel(Level challengeLevel) {
        this.challengeLevels.remove(challengeLevel);
    }
    
    public void removeChallengeLevel(int i) {
        this.challengeLevels.remove(i);
    }
    
    public Level getChallengeLevel(int i) {
        return this.challengeLevels.get(i);
    }
    /**
     * @return the timeTaken
     */
    public long getTimeTaken() {
        return timeTaken;
    }

    /**
     * @param timeTaken the timeTaken to set
     */
    public void setTimeTaken(long timeTaken) {
        this.timeTaken = timeTaken;
    }
    
}
