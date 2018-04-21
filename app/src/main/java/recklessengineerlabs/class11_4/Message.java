package recklessengineerlabs.class11_4;

import android.annotation.SuppressLint;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Message
{
    String sender;
    String message;
    private String timeStamp;
    public static ArrayList<Message> messages = new ArrayList<>();
    public Message()
    {
    }

    @SuppressLint("SimpleDateFormat")
    public Message(String sender, String message)
    {
        this.sender = sender;
        this.message = message;
        this.timeStamp = new SimpleDateFormat("HH:mm dd/MM").format(Calendar.getInstance().getTime());

//        addMessage(this);
    }

    public static void addMessage(Message msg){
        messages.add(msg);
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
