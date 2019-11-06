package com.jc.latihanview;

import android.media.Image;
import android.os.Bundle;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;


public class MainActivity extends Activity implements OnItemClickListener {

    private static final String[] items = { "wolf 1", "wolf 2","wolf 3","wolf 4","wolf 5","wolf 6"};
    private int[] imageID = {R.drawable.c1, R.drawable.c2, R.drawable.c3, R.drawable.c4, R.drawable.c5, R.drawable.c6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView g = (GridView) findViewById(R.id.grid);

        g.setAdapter(new IconAdapter());

        g.setOnItemClickListener(this);
    }


    private class IconAdapter extends ArrayAdapter<String> {

        public IconAdapter(){
            super(MainActivity.this, R.layout.cell, items);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent){

            View row = convertView;

            if (row == null){
                LayoutInflater inflater = getLayoutInflater();
                row = inflater.inflate(R.layout.cell, parent, false);
            }

            ImageView imageView = (ImageView) row.findViewById(R.id.imageView1);
            TextView keterangan = (TextView) row.findViewById(R.id.keterangan);


            imageView.setScaleType(ScaleType.FIT_XY);

            keterangan.setText(items[position]);
            imageView.setImageResource(imageID[position]);

            return row;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> arg0, View arg1, int p, long arg3){

        Toast.makeText(MainActivity.this, items[p] + "clicked!", Toast.LENGTH_SHORT).show();
    }


}