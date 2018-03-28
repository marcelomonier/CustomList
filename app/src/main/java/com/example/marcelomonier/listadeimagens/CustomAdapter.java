package com.example.marcelomonier.listadeimagens;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by marcelomonier on 28/03/18.
 */

public class CustomAdapter extends BaseAdapter{

    Integer [] imgs;
    Context context;

    private static LayoutInflater inflater=null;

    public CustomAdapter(MainActivity mainActivity, Integer[] imagens) {


        context=mainActivity;
        imgs = imagens;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return imgs.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class Holder{

        ImageView im;

    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        Holder holder = new Holder();
        View rowView;

        rowView = inflater.inflate(R.layout.custom_layout, null);
        holder.im=(ImageView) rowView.findViewById(R.id.imageView2);
        holder.im.setImageResource(imgs[position]);
        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked "+ imgs[position], Toast.LENGTH_LONG).show();
            }
        });
        return rowView;
    }
}
