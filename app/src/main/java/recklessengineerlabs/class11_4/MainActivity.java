package recklessengineerlabs.class11_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    ListView mListView;
    EditText messageText;
    Button sendButton;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageText = findViewById(R.id.input);
        sendButton = findViewById(R.id.btnSend);


    }


    public static class Pojo
    {
        String mTitle;
        String mSubtitle;

        public Pojo(String mTitle, String mSubtitle)
        {
            this.mTitle = mTitle;
            this.mSubtitle = mSubtitle;
        }

        public String getmTitle()
        {
            return mTitle;
        }

        public String getmSubtitle()
        {
            return mSubtitle;
        }

        public static List<Pojo> getListOfThings()
        {
            List<Pojo> returnVal = new ArrayList<>();
            for (int i = 0; i < 15; i++)
            {
                Pojo pojo = new Pojo("title # " + i, "Subtitle #" + (i * i));
                returnVal.add(pojo);
            }
            return returnVal;
        }

    }

    // Todo implement self chat
    // Todo read on recycler VIEW
    // Todo read the Slide on facebook.
    // Chat Hass youtube - Animation in recycler view.
}
