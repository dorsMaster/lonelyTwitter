package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
//class mood where
public abstract class Mood {
    private Date date;
    public void Mood(){
        this.date = new Date();
    }
    public void Mood (Date date){
        this.date = date;
    }
    public Date getdate(){
        return this.date;
    }
    public void setDate(Date date){
        this.date = date;
    }

    abstract public String getMood();
//    gets the mood
}
