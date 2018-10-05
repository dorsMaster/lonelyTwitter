package ca.ualberta.cs.lonelytwitter;

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


}
