package com.example.corona;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CoronaItem extends LinearLayout {
    private ImageView myIcon;
    private TextView myTitle;
    private TextView myComments;

    public CoronaItem(Context context, CoronaData data) {
        super(context);

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.corona_item_style, this, true);

        myIcon = findViewById(R.id.list_item_icon);
        myTitle = findViewById(R.id.list_item_title);
        myComments = findViewById(R.id.list_item_comments);
    }

    public void setIcon(int icon) {
        myIcon.setImageResource(icon);
    }

    public void setTitle(String title) {
        myTitle.setText(title);
    }

    public void setComments(String comments) {
        myComments.setText(comments);
    }
}
