package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Custom extends BaseAdapter {
    Context custom;
    LayoutInflater infilter;
    String status[];
    String details[];
    String time[];


    public Custom(Context applicationContext, String[] details,String[] status,String[] time) {

        this.custom = applicationContext;
        this.details=details;
        this.time= time;
        this.status= status;


        infilter = (LayoutInflater.from(custom));

    }
    @Override
    public int getCount() {
        return details.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = infilter.inflate(R.layout.activity_layout,null);
        TextView detail = view.findViewById(R.id.person);
        TextView status_v=view.findViewById(R.id.message);
        TextView time_v=view.findViewById(R.id.time);

        detail.setText(details[i]);
        status_v.setText(status[i]);
        time_v.setText(time[i]);
//        Collections.reverse(Arrays.asList(details))

        return view;
    }
}
