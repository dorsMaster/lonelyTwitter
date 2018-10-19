package ca.ualberta.cs.lonelytwitter;

<<<<<<< HEAD
import java.util.Date;

public class NormalTweet extends Tweet {
//    an extending the class tweet which overrides the is important to false
    /**
     * Constructor for NormalTweet using a string for the tweet text
     * and a custom date of creation.
     * @param message
     * @throws TweetTooLongException
     */
    public NormalTweet(String message) throws TweetTooLongException {
        super(message);
    }
    /**
     * Constructor for NormalTweet using a string for the tweet text
     * and a custom date of creation.
     * @param message
     * @param date
     * @throws TweetTooLongException
     */
    public NormalTweet(String message, Date date) throws TweetTooLongException {
        super(message, date);
    }

    /**
     * NormalTweet is not important.
     * @return isImportant
     */
    public boolean isImportant() {
        return false;
    }

    /**
     * NormalTweet is not important.
     * @return isImportant
     */
    public boolean isImportnat() {
        return false;
    }


=======
/**
 * Created by watts1 on 9/13/16.
 */
public class NormalTweet extends Tweet implements Tweetable {

    public NormalTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
>>>>>>> junit
}
