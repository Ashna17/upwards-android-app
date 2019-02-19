package com.example.apple.upwardsassignmentapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class RecyclerListAdapter extends RecyclerView.Adapter<RecyclerListAdapter.ItemViewHolder> {
    private List<Item> list;

    public RecyclerListAdapter(List<Item> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.text_view_layout,parent,false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(itemView);
        return itemViewHolder ;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.brand_name.setText(list.get(position).getBrand_name());
        holder.name.setText(list.get(position).getName());
        holder.size.setText(list.get(position).getSize());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView brand_name;
        TextView name;
        TextView size;

        public ItemViewHolder(View itemView) {
            super(itemView);
            brand_name = (TextView)itemView.findViewById(R.id.brand_name);
            name = (TextView)itemView.findViewById(R.id.name);
            size = (TextView)itemView.findViewById(R.id.size);
        }
    }
}
