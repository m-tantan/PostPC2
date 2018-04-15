package recklessengineerlabs.class11_4;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    ListView mListView;
    EditText messageText;
    Button sendButton;
    List<Message> messages;
    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    private ImageButton btnImage;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageText = findViewById(R.id.input);
        btnImage = findViewById(R.id.imgButton);

        //Testing Date and time extraction
//        messageText.setText(new SimpleDateFormat("HH:mm dd/MM").format(Calendar.getInstance().getTime()));
        initRecycleView();
        btnImage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Log.d("Clicked", "clicked");
                messages.add(new Message("You", messageText.getText().toString()));
            }
        });

    }

    private void initRecycleView()
    {
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager LLmanager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(LLmanager);
        adapter = new RecyclerViewAdapter(messages, this);
        recyclerView.setAdapter(adapter);

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
