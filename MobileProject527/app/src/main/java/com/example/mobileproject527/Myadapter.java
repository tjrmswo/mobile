package com.example.mobileproject527;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Myadapter extends BaseAdapter {
    Context mcontext = null;
    LayoutInflater layoutInflater = null;
    ArrayList<SampleData> sample;

    public Myadapter(Context context, ArrayList<SampleData> data) {
        mcontext = context;
        sample = data;
        layoutInflater = LayoutInflater.from(mcontext);
    }

    @Override
    public int getCount() {
        return sample.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return sample.get(position);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View view = layoutInflater.inflate(R.layout.announcementlistview, null);

        ImageView listImage = view.findViewById(R.id.listimage);
        TextView gongzidata = view.findViewById(R.id.gongzidata);
        TextView gongzidate = view.findViewById(R.id.gongzidate);

        listImage.setImageResource(sample.get(position).getPoster());
        gongzidata.setText(sample.get(position).getDetail());
        gongzidate.setText(sample.get(position).getDate());
        return view;
    }
}
