package com.example.mobileproject527;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Announcement extends AppCompatActivity {
    ArrayList<SampleData> samplelist;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announcement);

        this.InitializeListData();

        lv = findViewById(R.id.listgongzi);
        Myadapter myadapter = new Myadapter(this,samplelist);

        lv.setAdapter(myadapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast.makeText(getApplicationContext(), (Integer) myadapter.getItem(position),Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void InitializeListData(){
        samplelist = new ArrayList<SampleData>();

        samplelist.add(new SampleData(R.drawable.announcement,"인사말","2022-06-12"));
        samplelist.add(new SampleData(R.drawable.announcement,"유의사항","2022-06-11"));
    }
}