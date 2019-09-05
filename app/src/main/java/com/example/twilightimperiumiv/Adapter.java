package com.example.twilightimperiumiv;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.twilightimperiumiv.CustomRace.CustomRace;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<CustomRace> items;
    public Adapter (Context context, ArrayList<CustomRace> items){
        this.context = context;
        this.items = items;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(R.layout.custom_row, viewGroup, false);
        Item item = new Item(row);
        return item;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ((Item)viewHolder).textView.setText(items.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void  addItem(CustomRace item){
        items.add(item);
    }

    public class Item extends RecyclerView.ViewHolder {
        TextView textView;
        public Item (View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.item);
        }
    }
}
