package com.example.corona;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class SupportAdapter extends BaseAdapter {
    private Context mContext = null;

    private ArrayList<SupportData> mData = new ArrayList<SupportData>();

    public SupportAdapter(Context context) {
        this.mContext = context;
    }

    // 아이템을 추가
    public void addItem(SupportData data) {
        mData.add(data);
    }

    //아이템의 개수를 리턴
    public int getCount() {
        return mData.size();
    }

    public Object getItem(int position) {
        return mData.get(position).getTitle();
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        SupportItem itemView;

        if (convertView == null) {
            itemView = new SupportItem(mContext, mData.get(position));
        } else {
            itemView = (SupportItem)convertView;
        }

        itemView.setTitle(mData.get(position).getTitle());
        itemView.setSubTitle(mData.get(position).getSubTitle());
        itemView.setComment(mData.get(position).getComment());
        itemView.setLink(mData.get(position).getLink());

        return itemView;
    }
}
