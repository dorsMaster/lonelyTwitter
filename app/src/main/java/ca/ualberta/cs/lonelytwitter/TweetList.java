package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TweetList {
<<<<<<< HEAD
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
//    initializing an array
    /**
     * Adds a tweet to the list
     * @param tweet
     */
    public void addTweet(Tweet tweet) {
//        adds a tweet
=======

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void addTweet(Tweet tweet) {
>>>>>>> junit
        if (hasTweet(tweet)) {
            throw new IllegalArgumentException();
        }
        tweets.add(tweet);
    }
<<<<<<< HEAD
    /**
     * Boolean function to check if it  has a tweetThe Tweetable interface specifies that a class
     * @return hasTweet
     */
    private boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }
    /**
     * Get a tweet
     * @return tweets[i]
     */
    public Tweet getTweet(int i) {
        return tweets.get(i);
    }
    /**
     * Gets all the tweets from the list
     * @return tweets
     */
=======

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }

>>>>>>> junit
    public ArrayList<Tweet> getTweets() {
        Collections.sort(tweets, new Comparator<Tweet>() {
            public int compare(Tweet t1, Tweet t2) {
                return t1.getDate().compareTo(t2.getDate());
            }
        });
        return tweets;
    }
<<<<<<< HEAD
}
=======

    public int getCount() {
        return tweets.size();
    }

    public void deleteTweet(Tweet tweet) {
        tweets.remove(tweet);
    }

}
>>>>>>> junit
