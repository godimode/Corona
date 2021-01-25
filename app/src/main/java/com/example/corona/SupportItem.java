package com.example.corona;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SupportItem extends LinearLayout {
    private TextView mTitle;
    private TextView mSubTitle;
    private TextView mComment;
    private TextView mLink;

    public SupportItem(Context context, SupportData data){
        super(context);

        //인플레이션
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.support_item_style, this,true);

        mTitle = findViewById(R.id.support_item_title);
        mSubTitle = findViewById(R.id.support_item_subtitle);
        mComment = findViewById(R.id.support_item_comment);
        mLink = findViewById(R.id.support_item_link);
    }

    public void setTitle(String data) { mTitle.setText(data); };

    public void setSubTitle(String data) { mSubTitle.setText(data); };

    public void setComment(String data) { mComment.setText(data); }

    public void setLink(String data) { mLink.setText(data); }
}
