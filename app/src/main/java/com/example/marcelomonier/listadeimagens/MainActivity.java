package com.example.marcelomonier.listadeimagens;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    Context context;

    Integer[] imagens = {
            R.drawable.android, R.drawable.android, R.drawable.android,R.drawable.android,
            R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,
            R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,
            R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context=this;

    lv = (ListView) findViewById(R.id.list_image);
    lv.setAdapter((ListAdapter) new CustomAdapter(this, imagens));




    }




}
