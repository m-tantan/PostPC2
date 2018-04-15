package recklessengineerlabs.class11_4;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>
{
    ArrayList<Message> messages;
    Context mContext;

    public RecyclerViewAdapter(List<Message> messages, Context mContext)
    {
        this.messages = (ArrayList<Message>) messages;
        this.mContext = mContext;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view;
        view = LayoutInflater.from(mContext).inflate(R.layout.message_box, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position)
    {
        holder.tv_sender.setText(messages.get(position).getSender());
        holder.tv_message.setText(messages.get(position).getMessage());
        holder.tv_dateTime.setText(messages.get(position).getTimeStamp());
    }

    @Override
    public int getItemCount()
    {
        return messages.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {

        public TextView tv_message;
        public TextView tv_sender;
        public TextView tv_dateTime;

        public MyViewHolder(View itemView)
        {
            super(itemView);
            tv_message = itemView.findViewById(R.id.txtMessage);
            tv_sender = itemView.findViewById(R.id.sender);
            tv_dateTime = itemView.findViewById(R.id.txtDateTime);

        }
    }
}
