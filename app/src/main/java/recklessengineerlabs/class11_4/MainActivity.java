package recklessengineerlabs.class11_4;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
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
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity
{
    ListView mListView;
    EditText messageText;
    Button sendButton;
    static int msgCounter = 1;
    ArrayList<Message> messages;
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
                Log.d("Testing Program", "clicked send button");
                Log.d("Testing Program", "Input text is: " + messageText.getText().toString());
                Log.d("Testing Program", "Amount of messages is: " + ( messages.size()));
                messages.add(new Message("You", messageText.getText().toString()));
                messageText.setText("");
                adapter.notifyItemInserted(msgCounter - 1);

                Toast.makeText(getApplicationContext(), "added message number: " + String.valueOf(messages.size()) , Toast.LENGTH_SHORT).show();
                msgCounter ++;
            }
        });

    }

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs)
    {
        messages = new ArrayList<Message>();
        return super.onCreateView(parent, name, context, attrs);

    }

    private void initRecycleView()
    {
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        adapter = new RecyclerViewAdapter(messages, this);
        recyclerView.setAdapter(adapter);
    }

    // Todo look up Chat Hass youtube - Animation in recycler view.
}
