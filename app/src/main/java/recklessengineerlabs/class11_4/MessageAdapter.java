package recklessengineerlabs.class11_4;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

public class MessageAdapter
    extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
    List<Message> messages;
    Context mData;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position)
    {

    }

    @Override
    public int getItemCount()
    {
        return messages.size();
    }
}
