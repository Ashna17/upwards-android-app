package com.example.apple.upwardsassignment;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by apple on 15/2/19.
 */
public class RecyclerListAdapter extends RecyclerView.Adapter<RecyclerListAdapter.ItemViewHolder>
{
    private List<String> list;

    public RecyclerListAdapter(List<String> list){
        this.list = list;
    }

    //creates each object of the view holder
    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView textView = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.text_view_layout,parent,false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(textView);
        return itemViewHolder ;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.versionName.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder
    {
        TextView versionName;
        public ItemViewHolder(TextView itemView) {
            super(itemView);
            versionName  = itemView;
        }
    }
}
