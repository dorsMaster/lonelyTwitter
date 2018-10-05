package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
//class mood where
public abstract class Mood {
    private Date date;
    /**
     * constructor for mood that defualts at the current time
     * @return datw
     */
    public void Mood(){
        this.date = new Date();
    }
    /**
     * constructor for mood with a specified date
     */
    public void Mood (Date date){
        this.date = date;
    }
    /**
     * TO get the date of a tweet
     * @return date
     */
    public Date getdate(){
        return this.date;
    }
    /**
     * To set the date for a tweet
     */
    public void setDate(Date date){
        this.date = date;
    }


    /**
     * string representing the mood
     * @return mood
     */
    abstract public String getMood();
//    gets the mood
}
