package com.example.corona;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class CoronaAdapter extends BaseAdapter {
    private Context myContext = null;
    private ArrayList<CoronaData> myData = new ArrayList<CoronaData>();

    public CoronaAdapter(Context context) {
        this.myContext = context;
    }

    public void addItem(CoronaData data) {
        myData.add(data);
    }

    @Override
    public int getCount() {
        return myData.size();
    }

    @Override
    public Object getItem(int position) {
        return myData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CoronaItem itemView;

        if(convertView == null) {
            itemView = new CoronaItem(myContext, myData.get(position));
        }
        else {
            itemView = (CoronaItem)convertView;
        }

        itemView.setIcon(myData.get(position).getIcon());
        itemView.setTitle(myData.get(position).getTitle());
        itemView.setComments(myData.get(position).getComments());

        return itemView;
    }
}
