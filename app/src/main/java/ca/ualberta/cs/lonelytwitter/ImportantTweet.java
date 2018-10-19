package ca.ualberta.cs.lonelytwitter;
<<<<<<< HEAD
//an abstract class of important tweet, where the isImportant function can be overwritten


import java.util.Date;

public abstract class ImportantTweet extends Tweet {
    /**
     * Constructor for ImportantTweet using a string for the tweet text
     * and a custom date of creation.
     * @param message
     * @param date
     * @throws TweetTooLongException
     */
    public ImportantTweet(String message, Date date) throws TweetTooLongException {
        super(message, date);
        this.setMessage(message);
        this.date = date;
    }
    /**
     * Constructor for ImportantTweet using a string for the tweet text
     * and a custom date of creation.
     * @param message
     * @throws TweetTooLongException
     */
    public ImportantTweet(String message) throws TweetTooLongException {
        super(message);
    }
    @Override

    public boolean isImportnat(){
        return true;
    }


=======

/**
 * Created by watts1 on 9/13/16.
 */
public class ImportantTweet extends Tweet {

    public ImportantTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

>>>>>>> junit
}
