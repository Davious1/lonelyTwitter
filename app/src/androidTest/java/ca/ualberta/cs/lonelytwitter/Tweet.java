package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Tweet {
    private Date date;
    private String message;
    private static final Integer MAX_CHARS = 140;

    Tweet(){
        this.date = new Date();
        this.message = "default message: destroy all humans";

    }
    Tweet(String message)   {
        this.date = new Date();
        this.message = message;


    }
    public Date getDate()   {return this.date;}
    public String getMessage()  {return this.message}
    public void setMessage(String message)  {
        if (message.length() <= MAX_CHARS)  {
            this.message = message;
        } else{
            throw new TweetTooLongException();
        }

    }
    public abstract Booleab isImportant();
}
