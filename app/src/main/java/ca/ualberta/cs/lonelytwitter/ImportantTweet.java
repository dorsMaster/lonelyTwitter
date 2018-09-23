package ca.ualberta.cs.lonelytwitter;
//an abstract class of important tweet, where the isImportant function can be overwritten


public abstract class ImportantTweet extends Tweet {
    public ImportantTweet(String message){
        super(message);
    }
    @Override

    public boolean isImportnat(){
        return true;
    }

}
