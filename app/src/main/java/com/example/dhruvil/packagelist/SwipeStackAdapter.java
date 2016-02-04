package com.example.dhruvil.packagelist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class SwipeStackAdapter extends BaseAdapter {

    private List<String> mData;
    private Context ctx;
    private int colors[] = {R.color.c_bondi_blue,R.color.c_candypink,R.color.c_camel,R.color.c_antiqueruby};


    public SwipeStackAdapter(List<String> data, Context ctx) {
        this.mData = data;
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public String getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater li = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = li.inflate(R.layout.item_guide, parent, false);
        TextView textViewCard = (TextView) convertView.findViewById(R.id.txtGuide);
        textViewCard.setText(mData.get(position));

        View v = (View)convertView.findViewById(R.id.bg);
        convertView.setBackgroundColor(colors[position]);

        return convertView;
    }
}