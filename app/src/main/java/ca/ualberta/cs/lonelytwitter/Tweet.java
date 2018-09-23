package ca.ualberta.cs.lonelytwitter;
import java.util.ArrayList;
import java.util.Date;

public abstract class Tweet {
//    the father class Tweet

    protected String message;
    protected Date date;
    private ArrayList<Mood> moods = new ArrayList<Mood>();
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }
    public Tweet(String message, Date date){
//        overridden Tweet
        this.message = message;
        this.date = date;
    }
    public void setMessage(String text) throws TweetTooLongException {
//        to set the message
        if (message.length()>140) {
            throw new TweetTooLongException();
        }
            this.message = text;
    }
//    to set date
    public void setDate(Date date) {
        this.date = date;
    }
//    to get message
    public String getMessage() {
        return this.message;
    }
//    to get date
    public Date getDate() {
        return date;
    }
//    to add a mood
    public void addMood(Mood mood){
        moods.add(mood);
    }
//    to remove a mood
    public void removeMood(Mood mood){
        moods.remove(mood);
    }
//    initializing an array of moods
    public ArrayList<Mood> getMoods() {
        return moods;
    }
//    also the function is  important that is ab stract so each  class can define their own version
    public abstract boolean isImportant();

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }

    public abstract boolean isImportnat();
}