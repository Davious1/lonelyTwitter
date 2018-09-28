package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class RegularTweet extends Tweet   {

    ImportantTweet(){
        super();
    }

    ImportantTweet(String message)  {
        super(message);
    }

    @Override
    public Boolean isImportant()    {
        return false;
    }
}
