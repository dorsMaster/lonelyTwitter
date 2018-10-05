package ca.ualberta.cs.lonelytwitter;
import java.util.ArrayList;
import java.util.Date;

public abstract class Tweet {
//    the father class Tweet

    protected String message;
    protected Date date;
    private ArrayList<Mood> moods = new ArrayList<Mood>();

    /**
     * Constructor for Tweet with a string for the tweet text
     * and a custom date of creation.
     * @param message
     * @param date
     * @throws TweetTooLongException
     */
    public Tweet(String message, Date date){
//        overridden Tweet
        this.message = message;
        this.date = date;
    }
    /**
     * Constructor for Tweet with a string for the tweet text
     * @param message
     * @throws TweetTooLongException
     */
    public Tweet(String message) throws TweetTooLongException {
        this.setText(message);
        this.date = new Date();
    }
    public void setMessage(String text) throws TweetTooLongException {
//        to set the message
        if (message.length()>140) {
            throw new TweetTooLongException();
        }
            this.message = text;
    }
    /**
     * To set the date of the tweet
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }
    /**
     * Returns the message of the tweet
     */
    public String getMessage() {
        return this.message;
    }
    /**
     * Returns the date of the tweet
     * @reutn date
     */    public Date getDate() {
        return date;
    }
    /**
     * To add a mood
     * @param  mood
     */
    public void addMood(Mood mood){
        moods.add(mood);
    }
    /**
     * Removes a mood
     */
    public void removeMood(Mood mood){
        moods.remove(mood);
    }
    /**
     * returns mood
     * @return mood
     */
    public ArrayList<Mood> getMoods() {
        return moods;
    }
//    also the function is  important that is ab stract so each  class can define their own version
    /**
     * also the function is  important that is ab stract so each  class can define their own version
     * @return isImportant
     */
    public abstract boolean isImportant();

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }

    public abstract boolean isImportnat();
    /**
     * Set the string of the message
     * @param message
     * @throws TweetTooLongException
     */
    public void setText(String message) throws TweetTooLongException {
        if (message.length() <= 140) {
            this.message = message;
        } else {
            throw new TweetTooLongException();
        }
    }
}