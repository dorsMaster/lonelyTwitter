package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
//    initializing an array

    public void addTweet(Tweet tweet) {
//        adds a tweet
        if (hasTweet(tweet)) {
            throw new IllegalArgumentException();
        }
        tweets.add(tweet);
    }
// boolean function to check if it  has a tweet
    private boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }
//getter the tweet
    public Tweet getTweet(int i) {
        return tweets.get(i);
    }

    public ArrayList<Tweet> getTweets() {
        Collections.sort(tweets, new Comparator<Tweet>() {
            public int compare(Tweet t1, Tweet t2) {
                return t1.getDate().compareTo(t2.getDate());
            }
        });
        return tweets;
    }
}
