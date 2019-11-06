package com.jc.alertdialognotifintent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Menu1 extends AppCompatActivity {
    private Button mMenu1, mBack;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu1);
        mMenu1 = (Button)findViewById(R.id.bt_register);
        mBack = (Button) findViewById(R.id.bt_back);
        mMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Latihan Intent 1",Toast.LENGTH_LONG).show();
            }
        });
        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iBack = new Intent(getApplicationContext(),INT.class);
                startActivity(iBack);
                finish();
            }
        });
    }
}
