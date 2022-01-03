package com.example.modernlistview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
public class Adaptery extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] maintitle;
    private final String[] description;
    private final Integer[] imgss;
    public Adaptery(@NonNull Activity context, String[]
            maintitle, String[] description, Integer[] imgss)
    {
        super(context, R.layout.item_custom_list,maintitle);
        this.context = context;
        this.maintitle = maintitle;
        this.description = description;
        this.imgss = imgss;
    }
    public View getView(int position, View view, ViewGroup
            parent)
    {
        LayoutInflater inflater=context.getLayoutInflater();
//      LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        @SuppressLint("ViewHolder") View rowView =inflater.inflate(R.layout.item_custom_list,
                null,true);
        TextView titleText=(TextView) rowView.findViewById(R.id.title);
        TextView subTitle=(TextView) rowView.findViewById(R.id.subtitle);
        ImageView imageView =(ImageView) rowView.findViewById(R.id.icon);
        titleText.setText(maintitle[position]);
        subTitle.setText(description[position]);
        imageView.setImageResource(imgss[position]);
        return rowView;
    }
}
