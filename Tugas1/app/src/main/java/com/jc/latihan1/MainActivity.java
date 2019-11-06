package com.jc.latihan1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText EditText1 = (EditText)findViewById(R.id.editText1);
        Button Button1 = (Button)findViewById(R.id.button1);
        final EditText EditText3 = (EditText)findViewById(R.id.editText1);
        Button Button2 = (Button)findViewById(R.id.button1);
        final TextView tampil = (TextView)findViewById(R.id.textView1);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                tampil.setText("Nama anda : " + EditText1.getText().toString()+" anda Berhasil Login !");
            }
            });
        }
    }