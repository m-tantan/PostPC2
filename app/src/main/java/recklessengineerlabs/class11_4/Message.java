package recklessengineerlabs.class11_4;

import android.annotation.SuppressLint;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Message
{
    String sender;
    String message;
    String timeStamp;

    public Message()
    {
    }

    @SuppressLint("SimpleDateFormat")
    public Message(String sender, String message)
    {
        this.sender = sender;
        this.message = message;
        this.timeStamp = new SimpleDateFormat("HH:mm dd/MM").format(Calendar.getInstance().getTime());
    }

    // Getters

    public String getSender()
    {
        return sender;
    }

    public String getMessage()
    {
        return message;
    }

    public String getTimeStamp()
    {
        return timeStamp;
    }

    // Setters

    public void setSender(String sender)
    {
        this.sender = sender;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public void setTimeStamp(String timeStamp)
    {
        this.timeStamp = timeStamp;
    }
}
