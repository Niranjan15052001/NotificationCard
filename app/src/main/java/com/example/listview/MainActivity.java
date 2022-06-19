package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView simplelist;
    String details[]={"hi","hello"};
    String status[]={"Success","test"};
    String Time[]={"hello","bye"};
    RelativeLayout notification;
    ArrayList arr=new ArrayList();
    int c=Color.parseColor("#FFBB86FC");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simplelist = (ListView)findViewById(R.id.listview);
//        details={"Hi"};
//        status={"Success"};
//        time;

        Custom c = new Custom(getApplicationContext(), details,status,Time);
        simplelist.setAdapter(c);
        arr.add(0, c);
        c.notifyDataSetChanged();

        simplelist.post(new Runnable() {
            @Override
            public void run() {simplelist.smoothScrollToPosition(0);
            }
        });

        simplelist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                c=(int)Color.parseColor("#FFBB86FC");
                notification=view.findViewById(R.id.notification);
                notification.setBackgroundColor(Color.parseColor("#FFBB86FC"));
            }
        });

    }
}