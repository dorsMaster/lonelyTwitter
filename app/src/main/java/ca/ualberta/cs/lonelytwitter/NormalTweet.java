package ca.ualberta.cs.lonelytwitter;

public abstract class NormalTweet extends Tweet {
//    an extending the class tweet which overrides the is important to false

    public NormalTweet(String message) {
        super(message);
    }
    @Override
    public boolean isImportnat(){
        return false;
    }


}
