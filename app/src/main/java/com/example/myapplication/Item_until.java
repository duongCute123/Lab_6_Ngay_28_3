package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Item_until extends BaseAdapter{
    Context context;
    int layout;
    ArrayList<Item_entity> item_entities;

    public Item_until(Context context, int layout, ArrayList<Item_entity> item_entities) {
        this.context = context;
        this.layout = layout;
        this.item_entities = item_entities;
    }

    @Override
    public int getCount() {
        return item_entities.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=LayoutInflater.from(context).inflate(layout,viewGroup,false);
        TextView txtname=view.findViewById(R.id.txtname);
        TextView txtcoment=view.findViewById(R.id.txtcoment);
        ImageView txtimg=view.findViewById(R.id.txtimg);
        txtname.setText(item_entities.get(i).getName());
        txtcoment.setText(item_entities.get(i).getComent());
        txtimg.setImageResource(item_entities.get(i).getImg());
        return view;
    }
}
